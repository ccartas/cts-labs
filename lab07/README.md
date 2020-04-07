## Given the code in the Locomotive class and the GPSClientInterface interface, implement unit tests to verify that the methods run and generate results for different input data sets. Otherwise, the methods will be corrected.

### It is assumed that the methods have been developed based on the following specifications:
- currentSpeed attribute values are accepted from 0 to the value of MAX_SPEED static attribute, otherwise it generates an SpeedException exception;
- engineStatus takes values from the given EngineStates enumeration
- if the currentSpeed attribute is different than 0 then the engineStatus is only RUNNING
- if the currentSpeed attribute is 0 then the engineStatus is STOPPED or STARTING

### 6p. For each of the next two methods (Locomotive constructor, respectively setCurrentSpeed) write unit tests managed in different TestCases (one TestCase for each tested method), from which mandatory:
- One unit test for checking the Right condition for both methods (2 x 1p);
- One test to verify a condition for which the function being tested generates an exception for both methods. The exception is defined in solution in the dedicated subpackage (2 x 1p);
- One unit test for Boundary condition for both methods (2 x 1p);

### 4p. Test getAverageSpeed() implementing 
- A cross-check unit test ONLY for method getAverageSpeed () method; (2p)
- A inverse relationship unit test for getAverageSpeed () method. (2p)

### 5p. Implement a TestSuite that contains all methods from a TestCase (2p) and certain (minimum 2 of your choice, but not all) from the 2nd Test Case (3p).
### 5p. Implement a mock / stub or fake for the GPSClientInterface interface so that you can test the estimateRemainingTimeTillDestination() method in the Locomotive class in the absence of a GPSClientInterface object. Implement at least 2 tests for estimateRemainingTimeTillDestination() using mock objects so you cover all possible branches.

Unit tests are considered correct only if they are implemented property, as required, and if the test method has been corrected based on them.
Only solutions that do not have compilation errors are considered.
