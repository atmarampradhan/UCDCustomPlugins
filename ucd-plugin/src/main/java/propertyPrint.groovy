#!/usr/bin/env groovy

final def properties = new Properties();
final def inputPropertiesFile = new File(args[0]);
final def inputStream = null;

try {
    inputStream = new FileInputStream(inputPropertiesFile);
    properties.load(inputStream);
} catch (IOException e) {
    throw new RuntimeException(e);
}

println "Printing Properties"
for (String key : properties.stringPropertyNames()) {
    println "key : " + key + ", value : " + properties.getProperty(key);
}
