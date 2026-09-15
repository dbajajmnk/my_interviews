# Java 21 Commands / Preview Flags

## Check Version

```bash
java -version
javac -version
```

## Compile Normal Code

```bash
javac Demo.java
```

## Run

```bash
java Demo
```

## Compile Preview Features

```bash
javac --enable-preview --release 21 Demo.java
```

## Run Preview Code

```bash
java --enable-preview Demo
```

## Useful JVM Tools

```text
jcmd
jstack
jmap
jstat
jps
jfr
```

## GC / Runtime

Prefer modern unified JVM logging and JFR rather than relying on old removed/deprecated flags.

## Migration Check

Watch for:

```text
agent-loading warnings
unsupported JVM options
native-access issues
preview-feature mismatch
library bytecode incompatibility
```
