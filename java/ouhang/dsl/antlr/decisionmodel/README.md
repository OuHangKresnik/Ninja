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
		- Properties:  
			- default value, each signal with primitive type will have a default value  
			- log or not, default is true  
			- category
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
		- There are three kinds of output: 
			- Output to log, and all signals will be output to log by default
			- 
		- Output can server as input for other models
## Requirements
	1. Change of models can immediately be applied to systems without restart  
	2. Java Code can be embedded into functions

## Example
package java.ouhang.dsl.antlr.decisionmodel;
import java.JavaDataClass;
import java.JavaClass1;
import java.JavaClass2;

input {
	field1 : Boolean;
	field2 : Long;
	field3 : Double;
	field4 : List<String>;
	field5 : List<JavaDataClass>;
}

func double functionName (par1 : Double, par2 : Double) {
	return par1 + par2;
}

double signal1 = JavaClass1.method1(field3, field3);
signal1.default=123;
JavaClass2 signal2 = JavaClass.method2(field2, field3);
double signal3 = functionName(signal1, field3);

model double subModel {
	return signal3 + signal1;
}

model string mainModel {
	if (field1) {
		return "APPROVE";		
	} elif (field2 > subModel) {
		return "REVIEW";		
	} else {
		return "APPROVE";
	}
}
