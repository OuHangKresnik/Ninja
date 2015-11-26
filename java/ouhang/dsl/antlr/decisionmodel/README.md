# Decision Model
	Part of systems which process data, do analysis and make decisions.  
	Since it's in my java package, by default, it's used in a java system.
## Components
	1. Inputs  
		- Decision Model has inputs which comes from requests  
		- Inputs share the same data types with Java
		- Output of other models can server as input
	2. Signals
		- Based on Inputs, more data is needed for decision making  
		- Generation of signals depends on inputs
		- Signals can be generated from other models
	3. Functions & Operators  
		- Java classes and their methods can be embedded in as Functions  
		- Input of functions is signals, output of functions shares the same type as Java
	4. Module (offline)
		- Input of modules is signals by default  
		- Special module for offline learning results  
		- Support SVM, Decision Tree, Classifiers
	5. Import
		- Functions can be imported from different files  
		- Other models
	6. Output
		- All signals can be output  
		- Output can server as input for other models
## Requirements
	1. Change of models can immediately be applied to systems without restart  
	2. Java Code can be embedded into functions

## Example
import java.JavaDataClass
import java.JavaClass1
import java.JavaClass2

Input {
	field1 : Boolean
	field2 : Long
	field3 : Double
	field4 : List<String>
	field5 : List<JavaDataClass>
}

signal1 : Double = JavaClass1\[Method1\](field3, field3)
signal2 : JavaClass2 = JavaClass\[Method2\](field2, field3)
TODO (kresnik)

