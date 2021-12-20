package com.demo.util;

import gnmi.proto.Path;
import gnmi.proto.Path.Builder;
import gnmi.proto.PathElem;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.commons.lang3.StringUtils;

public class PathConverter {

  public static int nextTokenIndex(String path) {
    Boolean inBrackets = false;
    Boolean escape = true;

    char[] pathCharArray = path.toCharArray();
    for (int i = 0; i < pathCharArray.length; i++) {
      switch (pathCharArray[i]) {
        case '[':
          inBrackets = true;
          escape = false;
          break;
        case ']':
          if (!escape) {
            inBrackets = false;
          }
          escape = !escape;
          break;
        case '\\':
          escape = !escape;
          break;
        case '/':
          if (!inBrackets && !escape) {
            return i;
          }
          escape = false;
          break;
        default:
          escape = false;
      }
    }
    return pathCharArray.length;
  }

  public static Path xPath2Path(String path) {
    String[] pathList = path.split("/");
    Builder builder = Path.newBuilder();
    for (String p : pathList) {
      String name = null;
      String fieldName = null;
      String fieldValue = null;

      Pattern pattern = Pattern.compile("^(.*)\\[(.*)=(.*)\\]$");

      if (p.contains("[") && p.contains("]")) {
        System.out.println("p = " + p);
        Matcher matcher = pattern.matcher(p);

        matcher.find();
        name = matcher.group(1);
        fieldName = matcher.group(2);
        fieldValue = matcher.group(3);
      } else {
        name = p;
      }
      builder.setOrigin("openconfig");
      PathElem.Builder pathElemBuilder = PathElem.newBuilder();
      if (!StringUtils.isEmpty(name)) {
        pathElemBuilder.setName(name);
      }
      if (!(StringUtils.isEmpty(fieldName)) && !(StringUtils.isEmpty(fieldValue))) {
        pathElemBuilder.putKey(fieldName, fieldValue);
      }
      builder.addElem(
          pathElemBuilder.build()
      );
    }
    return builder.build();
  }
}
