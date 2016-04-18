package dibujable;

import java.awt.*;
import java.awt.event.*;

class VentanaCerrable extends Frame implements WindowListener {
	// constructores
	public VentanaCerrable() {
		super();
	}

	public VentanaCerrable(String title) {
		super(title);
		setSize(500, 500);
		addWindowListener(this);
	}

	// métodos de la interface WindowsListener
	@Override
	public void windowActivated(WindowEvent e) {
		;
		// No usado
	}

	@Override

	public void windowClosed(WindowEvent e) {
		;
		// No usado

	}

	@Override

	public void windowClosing(WindowEvent e) {
		// No usado

	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// No usado
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// No usado

	}

	@Override
	public void windowIconified(WindowEvent e) {
		;
		// No usado

	}

	@Override
	public void windowOpened(WindowEvent e) {
		;
		// No usado

	}
} // fin de la clase VentanaCerrable
