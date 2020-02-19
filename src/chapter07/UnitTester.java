package chapter07;

public class UnitTester {

    public void testType(Unit unit, String type, String expectedType){
        // arrange
        unit.setType(type);
        // act
        String actualType = unit.getType();
        // assert
        if(expectedType.equals(actualType)){
            System.out.println("Test passed");
        }else{
            System.out.println("Test failed");
        }
    }

    public void testUnitSpecificProperty(Unit unit, String propertyName, Object inputValue, Object expectedValue){
        // arrange
        unit.setProperty(propertyName, inputValue);
        // act
        Object actualValue = unit.getProperty(propertyName);
        // assert
        if(expectedValue.equals(actualValue)){
            System.out.println("Test passed");
        }else {
            System.out.println("Test fail");
        }
    }

    public void testChangeProperty(Unit unit, String propertyName, Object inputValue, Object expectedValue){
        // arrange
        unit.setProperty(propertyName, inputValue);
        // act
        Object actualValue = unit.getProperty(propertyName);
        // assert
        if(expectedValue.equals(actualValue)){
            System.out.println("Test passed");
        }else {
            System.out.println("Test fail");
        }
    }

    public void testNonExistentProperty(Unit unit, String propertyName){
        // arrange
        // act
        Object propertyValue = unit.getProperty(propertyName);
        // assert
        if(propertyValue == null){
            System.out.println("Test passed");
        }else{
            System.out.println("Test fail");
        }
    }
}
