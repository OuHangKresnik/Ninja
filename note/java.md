# More about Java
## [Java Programming Dynamics](http://www.ibm.com/developerworks/java/library/j-dyn0429/)
1. Gives you run-time access to a variety of class information: read, write fields, and call methods of a class selected at run time  
2. Reflection is many times slower than direct code for both field access and method calls  
3. Classworking: manipulate Java class information as another form of data structure  
4. Javassist: A library lets you inspect, edit and create Java Binary classes  
5.   

## [Reflection VS Code Generation](http://www.javaworld.com/article/2075801/java-se/reflection-vs--code-generation.html)
1. Data marshaling (pulling data from an outside source and loading it into a Java object)  
2. Load data from a file into an object's fields --> have to maintain the loading procedures, which may include frequent updates and rewrites due to changes to the source data  
3. Reflection makes a simple problem complex, the performance is bad and fail more often at runtime than during compilation  
4. Code Generation:  
  - Passive: requires human intervention to implement code  
  - Active: creating code that never has to be modified once it's generated   
