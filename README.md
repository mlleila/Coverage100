#Coverage Counters
JaCoCo uses a set of different counters to calculate coverage metrics. All these counters are derived from information contained in Java class files which basically are Java byte code instructions and debug information optionally embedded in class files. This approach allows efficient on-the-fly instrumentation and analysis of applications even when no source code is available. In most cases the collected information can be mapped back to source code and visualized down to line level granularity. Anyhow there are limitations to this approach. The class files have to be compiled with debug information to calculate line level coverage and provide source highlighting. Not all Java language constructs can be directly compiled to corresponding byte code. In such cases the Java compiler creates so called synthetic code which sometimes results in unexpected code coverage results.

##Instructions (C0 Coverage)
The smallest unit JaCoCo counts are single Java byte code instructions. Instruction coverage provides information about the amount of code that has been executed or missed. This metric is completely independent from source formatting and always available, even in absence of debug information in the class files.

##Branches (C1 Coverage)
JaCoCo also calculates branch coverage for all if and switch statements. This metric counts the total number of such branches in a method and determines the number of executed or missed branches. Branch coverage is always available, even in absence of debug information in the class files. Note that exception handling is not considered as branches in the context of this counter definition.

If the class files haven been compiled with debug information decision points can be mapped to source lines and highlighted accordingly:

No coverage: No branches in the line has been executed (red diamond)
Partial coverage: Only a part of the branches in the line have been executed (yellow diamond)
Full coverage: All branches in the line have been executed (green diamond)

##Lines
For all class files that have been compiled with debug information, coverage information for individual lines can be calculated. A source line is considered executed when at least one instruction that is assigned to this line has been executed.

Due to the fact that a single line typically compiles to multiple byte code instructions the source code highlighting shows three different status for each line containing source code:

No coverage: No instruction in the line has been executed (red background)
Partial coverage: Only a part of the instruction in the line have been executed (yellow background)
Full coverage: All instructions in the line have been executed (green background)
Depending on source formatting a single line of a source code may refer to multiple methods or multiple classes. Therefore the line count of methods cannot be simply added to obtain the total number for the containing class. The same holds true for the lines of multiple classes within a single source file. JaCoCo calculates line coverage for classes and source file based on the actual source lines covered.

