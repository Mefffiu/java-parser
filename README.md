# Java-Parser

[ANTLR](https://github.com/antlr/antlr4) based Java parser that writes output to `.csv` file.

### Prerequisites:

Java Runtime Environment 8:

Ubuntu:
```
sudo apt install default-jre
```
Windows:

* [Oracle JRE](https://www.oracle.com/technetwork/java/javase/downloads/jre8-downloads-2133155.html)

### Download:
Download latest `.jar` file from: [Github Releases](https://github.com/falanadamian/java-parser/releases)

### Usage:

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

### Examples:
This example is based on [code fragment](./example/Example.java) in example resources
* Run `.jar` file from cmd with command:
```
java -jar java-parser-1.1.jar /home/user/example-code /home/user/example-code/output.csv
```
* The command logs should look like this:
```
[main] INFO FileExplorer - Parsed directory: '/home/user/example-code'
[main] INFO FileExplorer - Output file:      '/home/user/example-code/output.csv'
[main] INFO FileExplorer - Parsing file: '/home/user/example-code/Example.java'
[main] INFO DataCollector - Found 6 structures
[main] INFO DataWriter - Saving structures...
[main] INFO FileExplorer - Parsed 1 files
[main] INFO FileExplorer - Found 6 structures
```
* Results should appear in folder given previously. The output for this example is [here](./example/output.csv) 
* antlr v4 grammar plugin can be used to easily generate structure tree of parsed code

<img src = "./example/example.svg" width="882px" height="400px">

* Import data using Python:
```python
import pandas as pd

df = pd.read_csv(path_to_output_csv)
df.head()
```

### Recognized structures:
1. Statements:
* Method Invocation
* Return Statement
* If Then Statement
* If Then Else Statement
* Try With Resources Statement
* Try Statement
* For Statement
* Do Statement
* While Statement
* Switch Statement


2. Declarations:
* Import Declaration
* Package Declaration
* Constant Declaration
* Interface Declaration
* Enum Declaration
* Class Declaration
* Constructor Declaration
* Field Declaration
* Method Declaration

# Authors
* [Karol Leśniak](https://github.com/kajkal)
* [Damian Falana](https://github.com/falanadamian)
* [Mateusz Rybka](https://github.com/Mefffiu)
* [Jarosław Blak](https://github.com/jaroslawblak)
