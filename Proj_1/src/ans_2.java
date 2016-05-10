
public class ans_2 {
	private static double dimens = 16;
	private static int size = 1;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StdDraw.setXscale(0, dimens);
		StdDraw.setYscale(0, dimens);
		double xpos = dimens;
		double ypos = dimens;

		// double quad = FindHole(dimens);

		double size1 = 1;
		double xpos1 = Math.round(Math.random() * 10) % dimens;
		double ypos1 = Math.round((Math.random() * 10)) % dimens;

		// generate hole

		double[] xpos11 = { xpos1, xpos1 + size1, xpos1 + size1, xpos1, xpos1 };
		double[] ypos11 = { ypos1, ypos1, ypos1 + size1, ypos1 + size1, ypos1 };
		StdDraw.setPenColor(StdDraw.BLACK);
		StdDraw.filledPolygon(xpos11, ypos11);

		// draw hole + sent to draw new hole in each quad
		Scan(xpos / 2, ypos / 2, dimens, xpos1, ypos1);
	}

	// public static int FindHole(double dimens) {
	//
	// int quad = 0;
	// double size1 = 1;
	// double xpos = Math.round(Math.random() * 10) % dimens;
	// double ypos = Math.round((Math.random() * 10)) % dimens;
	// double[] xpos11 = { xpos, xpos + size1, xpos + size1, xpos, xpos };
	// double[] ypos11 = { ypos, ypos, ypos + size1, ypos + size1, ypos };
	// StdDraw.polygon(xpos11, ypos11);
	//
	// if (xpos >= dimens / 2 && ypos >= dimens / 2) {
	//
	// quad = 1;
	// // DrawL(xpos,ypos,quad);
	// } else if (xpos < dimens / 2 && ypos >= dimens / 2) {
	//
	// quad = 2;
	// // DrawL(xpos,ypos,quad);
	// } else if (xpos < dimens / 2 && ypos < dimens / 2) {
	//
	// quad = 3;
	// // DrawL(xpos,ypos,quad);
	// } else if (xpos >= dimens / 2 && ypos < dimens / 2) {
	//
	// quad = 4;
	// // DrawL(xpos,ypos,quad);
	// }
	//
	// System.out.println(quad);
	// return quad; must return xpos ypos tooo.
	// }

	public static void DrawL(double xpos, double ypos, double quad) {
		double quad1;
		switch ((int) (quad)) {
		case 1: {
			double[] xpos1 = { xpos, xpos + size, xpos + size, xpos - size, xpos - size, xpos, xpos };
			double[] ypos1 = { ypos, ypos, ypos - size, ypos - size, ypos + size, ypos + size, ypos };
			StdDraw.setPenColor(StdDraw.GREEN);
			StdDraw.polygon(xpos1, ypos1);
            
		}
			break;
		case 2: {
			double[] xpos1 = { xpos, xpos, xpos + size, xpos + size, xpos - size, xpos - size, xpos };
			double[] ypos1 = { ypos, ypos + size, ypos + size, ypos - size, ypos - size, ypos, ypos };
			//StdDraw.setPenColor(StdDraw.CYAN);
			StdDraw.setPenColor(StdDraw.GREEN);
			StdDraw.polygon(xpos1, ypos1);

		}
			break;
		case 3: {
			double[] xpos1 = { xpos, xpos, xpos + size, xpos + size, xpos - size, xpos - size, xpos };
			double[] ypos1 = { ypos, ypos - size, ypos - size, ypos + size, ypos + size, ypos, ypos };
			//StdDraw.setPenColor(StdDraw.ORANGE);
			StdDraw.setPenColor(StdDraw.GREEN);
			StdDraw.polygon(xpos1, ypos1);
		}
			break;
		case 4: {
			double[] xpos1 = { xpos, xpos + size, xpos + size, xpos - size, xpos - size, xpos, xpos };
			double[] ypos1 = { ypos, ypos, ypos + size, ypos + size, ypos - size, ypos - size, ypos };
			//StdDraw.setPenColor(StdDraw.YELLOW);
			StdDraw.setPenColor(StdDraw.GREEN);
			StdDraw.polygon(xpos1, ypos1);
			break;
		}

		}
		// consult for terminate condition
		// DrawL((Math.random() * 10) % 4,( Math.random() * 10) % 4, (int)
		// (Math.round((Math.random() * 10) % 4)));

	}

	// xpos ypos >>pos of L and other >> pos of hole
	public static void Scan(double xpos, double ypos, double dimens, double hole_xpos, double hole_ypos) {

		int quad = 0;
		double holexpos_ud = 0, holeypos_ud = 0;
		// terminate
		if (dimens <= 1)
			return;
		// new hole virtual of each quad 1-4 that need in Draw L
		if ((hole_xpos >= xpos) && (hole_ypos >= ypos))
			quad = 1;
		else if ((hole_xpos < xpos) && (hole_ypos >= ypos))
			quad = 2;
		else if ((hole_xpos < xpos) && (hole_ypos < ypos))
			quad = 3;
		else if ((hole_xpos >= xpos) && (hole_ypos < ypos))
			quad = 4;
		DrawL(xpos, ypos, quad);

		holexpos_ud = hole_xpos;
		holeypos_ud = hole_ypos;

		if (quad == 1) {

			Scan(xpos + dimens / 4, ypos + dimens / 4, dimens / 2, holexpos_ud, holeypos_ud);

			Scan(xpos - dimens / 4, ypos + dimens / 4, dimens / 2, xpos , ypos-1);

			Scan(xpos - dimens / 4, ypos - dimens / 4, dimens / 2, xpos  , ypos + 1);

			Scan(xpos + dimens / 4, ypos - dimens / 4, dimens / 2, xpos-1, ypos);
		}
		if (quad == 2) {
			// draw center
			Scan(xpos - dimens / 4, ypos + dimens / 4, dimens / 2, holexpos_ud, holeypos_ud);

			Scan(xpos + dimens / 4, ypos + dimens / 4, dimens / 2, xpos , ypos-1);

			Scan(xpos + dimens / 4, ypos - dimens / 4, dimens / 2, xpos , ypos);

			Scan(xpos - dimens / 4, ypos - dimens / 4, dimens / 2, xpos+1, ypos);
		}
		
		if (quad == 3) {

			Scan(xpos - dimens / 4, ypos - dimens / 4, dimens / 2, holexpos_ud, holeypos_ud);

			Scan(xpos + dimens / 4, ypos + dimens / 4, dimens / 2, xpos-1 , ypos-1);

			Scan(xpos - dimens / 4, ypos + dimens / 4, dimens / 2, xpos  , ypos -1);

			Scan(xpos + dimens / 4, ypos - dimens / 4, dimens / 2, xpos-1, ypos);
		
		}
		if (quad == 4) {

			Scan(xpos + dimens / 4, ypos - dimens / 4, dimens / 2, holexpos_ud, holeypos_ud);

			Scan(xpos + dimens / 4, ypos + dimens / 4, dimens / 2, xpos-1 , ypos-1);

			Scan(xpos - dimens / 4, ypos - dimens / 4, dimens / 2, xpos  , ypos );

			Scan(xpos - dimens / 4, ypos + dimens / 4, dimens / 2, xpos, ypos-1);
		}

	}

}
