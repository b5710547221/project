
public class tilling {
	private static double dimens = 8;
    private static double size = 0.5;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double xpos = dimens/2;
		double ypos = dimens/2 ;
		int quad = FindHole(dimens);
		DrawL(xpos,ypos,quad,dimens);
		
		//double dimens_cen = dimens / 2;
        // Scan(xpos,ypos,quad,dimens);
//		
//		Scan(xpos,ypos,quad);
//        Scan(xpos+(dimens_cen/2),ypos,quad);
//        Scan(xpos,ypos+(dimens_cen/2),quad);
//        Scan(xpos-(dimens_cen/2),ypos,quad);
//        Scan(xpos,ypos-(dimens_cen/2),quad);
//		Scan((xpos / 2 ), (ypos / 2 ), quad);
//		Scan((xpos / 2 ) + (dimens_cen-2), (ypos / 2 ), quad);
//		Scan((xpos / 2 ), (ypos / 2 ) + (dimens_cen-2), quad);
//     	Scan((xpos / 2 ) + (dimens_cen-2), (ypos / 2 ) + (dimens_cen-2), quad);
       
        
        
        
	}

	public static int FindHole(double dimens) {
		StdDraw.setXscale(0, dimens);
		StdDraw.setYscale(0, dimens);
		int quad = 0;
		double size1 = 0.5;
		double xpos = Math.round(Math.random() * 10) % dimens;
		double ypos = Math.round((Math.random() * 10)) % dimens;

		if (xpos >= dimens / 2 && ypos >= dimens / 2) {
			double[] xpos11 = { xpos, xpos + size1, xpos + size1, xpos, xpos };
			double[] ypos11 = { ypos, ypos, ypos + size1, ypos + size1, ypos };
			StdDraw.polygon(xpos11, ypos11);
			quad = 1;
			// DrawL(xpos,ypos,quad);
		} else if (xpos < dimens / 2 && ypos >= dimens / 2) {
			double[] xpos11 = { xpos, xpos, xpos - size1, xpos - size1, xpos };
			double[] ypos11 = { ypos, ypos + size1, ypos + size1, ypos, ypos };
			StdDraw.polygon(xpos11, ypos11);
			quad = 2;
			// DrawL(xpos,ypos,quad);
		} else if (xpos < dimens / 2 && ypos < dimens / 2) {
			double[] xpos11 = { xpos, xpos - size1, xpos - size1, xpos, xpos };
			double[] ypos11 = { ypos, ypos, ypos - size1, ypos - size1, ypos };
			StdDraw.polygon(xpos11, ypos11);
			quad = 3;
			// DrawL(xpos,ypos,quad);
		} else if (xpos >= dimens / 2 && ypos < dimens / 2) {
			double[] xpos11 = { xpos, xpos + size1, xpos + size1, xpos, xpos };
			double[] ypos11 = { ypos, ypos, ypos - size1, ypos - size1, ypos };
			StdDraw.polygon(xpos11, ypos11);
			quad = 4;
			// DrawL(xpos,ypos,quad);
		}
		

		return quad;
	}

	public static void DrawL(double xpos, double ypos, double quad,double dimens) {
		StdDraw.setXscale(0, dimens);
		StdDraw.setYscale(0, dimens);
		double quad1=1,quad2=1,quad3=1;
		switch ((int)(quad)) {
		case 1: {
			double[] xpos1 = { xpos, xpos + size, xpos + size, xpos - size, xpos - size, xpos, xpos };
			double[] ypos1 = { ypos, ypos, ypos - size, ypos - size, ypos + size, ypos + size, ypos };
			StdDraw.polygon(xpos1, ypos1);
			quad =  1;
			quad1 = 2;
			quad2 = 3;
			quad3 = 4;
		}
			break;
		case 2: {
			double[] xpos1 = { xpos, xpos, xpos + size, xpos + size, xpos - size, xpos - size, xpos };
			double[] ypos1 = { ypos, ypos + size, ypos + size, ypos - size, ypos - size, ypos, ypos };
			StdDraw.polygon(xpos1, ypos1);
			quad =  2;
			quad1 = 1;
			quad2 = 3;
			quad3 = 4;
		}
			break;
		case 3: {
			double[] xpos1 = { xpos, xpos, xpos + size, xpos + size, xpos - size, xpos - size, xpos };
			double[] ypos1 = { ypos, ypos - size, ypos - size, ypos + size, ypos + size, ypos, ypos };
			StdDraw.polygon(xpos1, ypos1);
			quad1 = 1;
			quad2 = 2;
			quad3 = 4;
			quad =  3;
		}
			break;
		case 4: {
			double[] xpos1 = { xpos, xpos + size, xpos + size, xpos - size, xpos - size, xpos, xpos };
			double[] ypos1 = { ypos, ypos, ypos + size, ypos + size, ypos - size, ypos - size, ypos };
			StdDraw.polygon(xpos1, ypos1);
			quad1 = 1;
			quad2 = 2;
			quad3 = 3;
			quad =  4;
			break;
		}
			
		}
		// consult for terminate condition
		// DrawL((Math.random() * 10) % 4,( Math.random() * 10) % 4, (int)
		// (Math.round((Math.random() * 10) % 4)));
		   
		   DrawL(dimens/2,dimens/2,quad,dimens/2);
		   DrawL(dimens/2+dimens/2,dimens/2,quad3,dimens/2);
		   DrawL(dimens/2+dimens/2,dimens/2+dimens/2,quad1,dimens/2);
		   DrawL(dimens/2,dimens/2+dimens/2,quad2,dimens/2);
		   if(dimens<=1){
			   return;
		   }
			
	}

	public static void Scan(double xpos, double ypos, double quad,double dimens) {

		if (dimens == 2) {
			if (quad == 1) {
				DrawL(xpos, ypos, 1,dimens/2);
				
//				DrawL(xpos+size,ypos+size,1,dimens/2);
//				DrawL(xpos-size,ypos-size,1,dimens/2);
//				DrawL(xpos+size,ypos-size,2,dimens/2);
//				DrawL(xpos-size,ypos+size,4,dimens/2);
			} else if (quad == 2) {
				DrawL(xpos, ypos, 2,dimens/2);
				
//				DrawL(xpos+size,ypos+size,3,dimens/2);
//				DrawL(xpos-size,ypos-size,1,dimens/2);
//				DrawL(xpos+size,ypos-size,2,dimens/2);
//				DrawL(xpos-size,ypos+size,2,dimens/2);
			} else if (quad == 3) {
				DrawL(xpos, ypos, 3,dimens/2);
				
//				DrawL(xpos+size,ypos+size,3,dimens/2);
//				DrawL(xpos-size,ypos-size,3,dimens/2);
//				DrawL(xpos+size,ypos-size,2,dimens/2);
//				DrawL(xpos-size,ypos+size,4,dimens/2);
			} else if (quad == 4) {
				DrawL(xpos, ypos, 4,dimens/2);
				
//				DrawL(xpos+size,ypos+size,3,dimens/2);
//				DrawL(xpos-size,ypos-size,1,dimens/2);
//				DrawL(xpos+size,ypos-size,4,dimens/2);
//				DrawL(xpos-size,ypos+size,4,dimens/2);
			}
		} else if (dimens <= 1) {
			return;
		} else {
			if (quad == 1) {
				DrawL(xpos, ypos, 1,dimens/2);
				
//				DrawL(xpos+size,ypos+size,1,dimens/2);
//				DrawL(xpos-size,ypos-size,1,dimens/2);
//				DrawL(xpos+size,ypos-size,2,dimens/2);
//				DrawL(xpos-size,ypos+size,4,dimens/2);
			} else if (quad == 2) {
				DrawL(xpos, ypos, 2,dimens/2);
				
//				DrawL(xpos+size,ypos+size,3,dimens/2);
//				DrawL(xpos-size,ypos-size,1,dimens/2);
//				DrawL(xpos+size,ypos-size,2,dimens/2);
//				DrawL(xpos-size,ypos+size,2,dimens/2);
			} else if (quad == 3) {
				DrawL(xpos, ypos, 3,dimens/2);
//				DrawL(xpos+size,ypos+size,3,dimens/2);
//				DrawL(xpos-size,ypos-size,3,dimens/2);
//				DrawL(xpos+size,ypos-size,2,dimens/2);
//				DrawL(xpos-size,ypos+size,4,dimens/2);
			} else if (quad == 4) {
				DrawL(xpos, ypos, 4,dimens/2);
//				DrawL(xpos+size,ypos+size,3,dimens/2);
//				DrawL(xpos-size,ypos-size,1,dimens/2);
//				DrawL(xpos+size,ypos-size,4,dimens/2);
//				DrawL(xpos-size,ypos+size,4,dimens/2);
			}
		}
		   
       
	}
}
