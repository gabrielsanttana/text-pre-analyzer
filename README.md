<div align="center">
  <h1>📄 Text Pre Analyzer</h1>
</div>

#####

<p align="center">An application that preprocesses text to be further analyzed as a digraph</p>

## 🛠️ Technologies

<ul>
  <li><a href="https://www.java.com/pt-BR/">Java</a></li>
</ul>

## ⚙️ Requirements

<ul>
  <li><a href="https://git-scm.com/">Git</a></li>
  <li><a href="https://www.oracle.com/br/java/technologies/javase-jdk15-downloads.html">JDK and JRE</a></li>
</ul>

## 🚀 Installation

```bash
$ git clone https://github.com/gabrielsanttana/text-pre-analyzer
```

### .txt

To be able to properly run the program, add `example.txt` file in the project root with the following text:

```
Wanted and Wild
MoonSun


See the spot no one may touch
Crossed the line way too much
Resist the urge to slip away
Getting stronger day by day
See the light in our eyes
Faces pale at the sound of lies
The scarlet key will still shine on
When the masters will be gone
Let us wake up in a sea of trees
And in gentle waves of the endless sea
These are the days we'll never forget
These are the days we'll never regret
Fight for the right, defending our pride
Wanted and wild, we're wanted and wild
Surrender of our souls
Dread to think like shallow holes
Restrained to others that we pass
Equality among the mass
Let us wake up in a sea of trees
And in gentle waves of the endless sea
These are the days we'll never forget
These are the days we'll never regret
Fight for the right, defending our pride
Wanted and wild, we're wanted and wild
We will break the chains of time
Too many tombs we leave behind
A break of dawn without remorse
Guided by our secret source
These are the days we'll never forget
These are the days we'll never regret
Fight for the right, defending our pride
Wanted and wild, we're wanted and wild
Wanted and wild
We're wanted and wild
```

### .csv

To generate the digraph (in `.csv` format) from this text, run:

```bash
$ cd text-pre-analyzer/src
$ javac Main.java
$ java Main ../example.txt

```
