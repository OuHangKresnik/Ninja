# Decision Model
	Part of systems which process data, do analysis and make decisions.  
	Since it's in my java package, by default, it's used in a java system.
## Components
	1. Inputs  
		- Decision Model has inputs which comes from requests  
		- Inputs share the same data types with Java
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
		- Can import java class and other model files  
		- Different from "import" in Java, it's more like an indicator
	6. Output
		- There are three kinds of output: 
			- Output to log, and all signals are logged by default  
			- Output to special ETL; Signals can be grouped for this purpose.
		- Output can serve as signals for other models
## Requirements
	1. Change of models can immediately be applied to systems without restart 
		- For this purpose, there are two ways to do it:  
			- Generate Java code & classes and utilize hotswap and class loader as JSP to Tomcat
			- Don't do above, construct model object without generating new java code. But need a loading procedure
	2. 
