# Java-Parser

[ANTLR](https://github.com/antlr/antlr4) based Java parser that writes output to `.csv` file.

###Prerequisites:

Java Runtime Environment 8:

Ubuntu:
```
sudo apt install default-jre
```
Windows:

* [Oracle JRE](https://www.oracle.com/technetwork/java/javase/downloads/jre8-downloads-2133155.html)

MacOS:
NOT SUPPORTED

###Download:
Download latest `.jar` file from: [Github Releases](https://github.com/falanadamian/java-parser/releases)

###Usage:

```
java -jar <java-parser-x.x.jar> <input-directory-path> [output-file-path.csv]
```

* `input-directory-path` - path to the directory from which `.java` files will be read.
Specifying a path that does not point to a directory results in an error:
```
/example/path/to/resource is not a directory. Please provide valid directory path.
```

* `output-file-path.csv` - optional, default is `output.csv` in working directory.
Specifying file without extension results in adding `.csv`:
```
output => output.csv
output.csv => output.csv
output.txt => output.txt.csv
```

###Examples:
* Run `.jar` file:
```
$ java -jar java-parser-1.0.jar input/
[main] INFO FileExplorer - Parsed directory: '/home/user/java-parser-test/input'
[main] INFO FileExplorer - Output file:      '/home/user/java-parser-test/output.csv'
[main] INFO FileExplorer - Parsing file: '/home/user/java-parser-test/input/NWD.java'
[main] INFO DataCollector - Found 383 structures
[main] INFO DataWriter - Saving structures...
[main] INFO FileExplorer - Parsing file: '/home/user/java-parser-test/input/Java8Parser.java'
[main] INFO DataCollector - Found 527559 structures
[main] INFO DataWriter - Saving structures...
[main] INFO FileExplorer - Parsing file: '/home/user/java-parser-test/input/Main.java'
[main] INFO DataCollector - Found 315 structures
[main] INFO DataWriter - Saving structures...
[main] INFO FileExplorer - Parsed 3 files
[main] INFO FileExplorer - Found 528257 structures
```

* Import data using Python:
```python
import pandas as pd

df = pd.read_csv(path_to_output_csv)
df.head()
```

#Authors
* [Karol Leśniak](https://github.com/kajkal)
* [Damian Falana](https://github.com/falanadamian)
* [Mateusz Rybka](https://github.com/Mefffiu)
* [Jarosław Blak](https://github.com/jaroslawblak)
