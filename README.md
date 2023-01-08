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

## [App](/doc/intro.md)

* `cd ..`
* `lein new app --to-dir lein-clojure-lib --force `


## License

Copyright © 2023 Joem Elias Sanez

This program and the accompanying materials are made available under the
terms of the Eclipse Public License 2.0 which is available at
http://www.eclipse.org/legal/epl-2.0.

This Source Code may also be made available under the following Secondary
Licenses when the conditions for such availability set forth in the Eclipse
Public License, v. 2.0 are satisfied: GNU General Public License as published by
the Free Software Foundation, either version 2 of the License, or (at your
option) any later version, with the GNU Classpath Exception which is available
at https://www.gnu.org/software/classpath/license.html.
