# Clojure with Leiningen Development Environment

Everything is an expression!
> Every coherent block of code you write will return a value.

* Statement: An action to be performed
  * does not return a value
    * like writing an `if` statement
* Expression: A syntactic unit that can be evaluated 
  * returns a value
    * like calling a function

Syntax!
> Code is data

## Requirements
* CLI/Terminal
  * Install [lein](https://leiningen.org/#install) as an executable from `$PATH`
  * Run `lein`
  * `lein --version`
* VScode
  * Install `calva` REPL extension

## Installation
* Run `lein repl` in VSCode Terminal
  * `nREPL server started on port 62833 on host 127.0.0.1 - nrepl://127.0.0.1:62833`
  * Copy `62833`
* Hit `"REPL"` at bottom tab nav VSCode (this is the calva ext)
  * Select `"Connect to a running REPL, not in your project"`
  * Select `"Leiningen"`
  * Input `localhost:62833`
* Window on right prints out output of all expressions

## Usage

* Select Clojure code expressions in left editor and (CTRL ENTER):
  * `> Calva: Evaluate Current Form (or selection, if any`

  ```clj
    clj꞉user꞉> 
    Hello World!
    nil
  ``` 

  * Whatever value of the expressions selected is printed on the right window as well as the return value of the last expression (`println` is a side effect)
* You can also use the VSCode terminal for one-off commands

