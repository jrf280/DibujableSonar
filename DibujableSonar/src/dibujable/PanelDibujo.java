package dibujable;

import java.awt.*;
import java.util.Iterator;
import java.util.List;

public class PanelDibujo extends Panel {
	// variable miembro
	private transient List<?> v;

	// constructor
	public PanelDibujo(List<?> va) {
		super(new FlowLayout());
		this.v = va;
	}

	// redefinición del método paint()
	@Override
	public void paint(Graphics g) {
		Dibujable dib;
		Iterator<?> it;
		it = v.iterator();
		while (it.hasNext()) {
			dib = (Dibujable) it.next();
			dib.dibujar(g);
		}
	}
}