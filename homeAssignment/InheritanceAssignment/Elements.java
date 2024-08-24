package week2.InheritanceAssignment;

public class Elements extends Button {
	
	public static void main(String[] args) {

		Button button = new Button();
		TextFeild textField = new TextFeild();
        CheckBoxButton checkBoxButton = new CheckBoxButton();
        RadioButton radioButton = new RadioButton();
        Elements elements = new Elements();
        
        //Button
        button.click();
        button.submit();
        System.out.println("------------------------------");
        System.out.println();
        
        //TextFeild
        textField.setText("Hello"); // Set text in text field
     // Get text from text field
        System.out.println("Text field contains: " + textField.getText()); 
        System.out.println("------------------------------");
        System.out.println();
        
        //CheckBox
        checkBoxButton.clickCheckButton(); // Click check box button
        System.out.println("------------------------------");
        System.out.println();
        
        //RadioButton
        radioButton.selectRadioButton(); // Select radio button
        System.out.println("------------------------------");
        System.out.println();
        
        //Elements 
        elements.click();
        elements.setText("Prasanna");
        elements.submit();
        
	}

	

}
