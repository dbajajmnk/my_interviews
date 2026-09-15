# Java 17 Commands / JVM Recall

## Version

```bash
java -version
javac -version
```

## Compile

```bash
javac Demo.java
```

## Run

```bash
java Demo
```

## Preview Feature Compile

```bash
javac --enable-preview --release 17 Demo.java
```

## Preview Run

```bash
java --enable-preview Demo
```

## Useful Runtime Tools

```text
jcmd
jstack
jmap
jstat
jps
jfr
```

## Modules

```bash
java --list-modules
jdeps app.jar
jlink ...
```

## Migration Diagnostics

Look for:

```text
illegal reflective access
internal JDK package usage
unsupported JVM flags
dependency bytecode incompatibility
```
