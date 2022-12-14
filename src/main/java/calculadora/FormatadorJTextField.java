package calculadora;

import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

public class FormatadorJTextField extends PlainDocument{

	//Metodo para que o JTextField só aceite numeros
	@Override
	public void insertString(int offs, String str, AttributeSet a) throws BadLocationException {
		super.insertString(offs, str.replaceAll("[^0-9][.]", ""), a);
	}
}
