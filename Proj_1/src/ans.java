import java.util.Arrays;

public class ans {
	
	private static double dimens = 4;
    private static double size = 1;
    
    public static int findquad(double xpos,double ypos,double c_xpos,double c_ypos)
    {
    	int result = 0;
    	
    	if (xpos < c_xpos && ypos < c_ypos) {		
    		result = 1;
		} else if (xpos >= c_xpos && ypos < c_ypos ) {
			result = 2;
		} else if (xpos < c_xpos && ypos >= c_ypos) {
			result = 3;
		} else {
			result = 4;
		}
    	
    	return result; 
    }
    
    public static void op(double rt_xpos,double rt_ypos,int rt_quad,double c_dimens,double c_lv)
    {
    	//Has Center ?
    	
    	System.out.println("");
    	for(int i = 1;i <= c_lv;i++)
    	{
    		System.out.print(" ");
    	}
    	System.out.print("Level : " + c_lv + " , Quad : " + rt_quad);
    	
    	double c_xpos = 0;
		double c_ypos = 0;
    	if(c_dimens > 1)
    	{
    		c_xpos = c_dimens / 2;
    		c_ypos = c_dimens / 2;
    		
    		double cn_xpos = c_xpos;
    		double cn_ypos = c_ypos;
    		int c_quad;
    		switch (rt_quad)
        	{
        		case 1 : //Quad 1
            		     op(rt_xpos,rt_ypos,3,c_dimens / 2,c_lv + 1); //2
            		     op(rt_xpos,rt_ypos,1,c_dimens / 2,c_lv + 1); //4
            		     op(rt_xpos,rt_ypos,2,c_dimens / 2,c_lv + 1); //3
            		     
            		     cn_xpos = cn_xpos + (c_dimens * c_lv);
            		     c_quad = findquad(rt_xpos,rt_xpos,cn_xpos,cn_ypos);
            		     op(rt_xpos,rt_ypos,c_quad,c_dimens / 2,c_lv + 1); //3
            		     
            		   
        		 		 break;
        		case 2 : //Quad 2
            		     op(rt_xpos,rt_ypos,1,c_dimens / 2,c_lv + 1); //4
            		     op(rt_xpos,rt_ypos,2,c_dimens / 2,c_lv + 1); //3
            		     op(rt_xpos,rt_ypos,4,c_dimens / 2,c_lv + 1); //1
            		  
            		     c_quad = findquad(rt_xpos,rt_xpos,cn_xpos,cn_ypos);
            		     op(rt_xpos,rt_ypos,c_quad,c_dimens / 2,c_lv + 1); //3
    	 		 		 break;
        		case 3 : //Quad 3
            		     op(rt_xpos,rt_ypos,4,c_dimens / 2,c_lv + 1); //1
            		     op(rt_xpos,rt_ypos,3,c_dimens / 2,c_lv + 1); //2
            		     op(rt_xpos,rt_ypos,1,c_dimens / 2,c_lv + 1); //4
            		     
            		     cn_xpos = cn_xpos + (c_dimens * c_lv);
			             cn_ypos = cn_ypos + (c_dimens * c_lv);
			             c_quad = findquad(rt_xpos,rt_xpos,cn_xpos,cn_ypos);
			             op(rt_xpos,rt_ypos,c_quad,c_dimens / 2,c_lv + 1); //3
    	 		 		 break;
        		case 4 : //Quad 4
		            	 op(rt_xpos,rt_ypos,2,c_dimens / 2,c_lv + 1); //3
		            	 op(rt_xpos,rt_ypos,4,c_dimens / 2,c_lv + 1); //1
		            	 op(rt_xpos,rt_ypos,3,c_dimens / 2,c_lv + 1); //2
		            	
		            	 cn_ypos = cn_ypos + (c_dimens * c_lv);
		            	 c_quad = findquad(rt_xpos,rt_xpos,cn_xpos,cn_ypos);
		            	 op(rt_xpos,rt_ypos,c_quad,c_dimens / 2,c_lv + 1); //3
    	 		         break;
        	}

    		System.out.println("");
    		for(int i = 1;i <= c_lv;i++)
        	{
        		System.out.print(" ");
        	}
    		System.out.println("Level : " + c_lv + " , Quad : " + rt_quad + " Draw");
    		for(int i = 1;i <= c_lv;i++)
        	{
        		System.out.print(" ");
        	}
    		System.out.println("Center : " + cn_xpos + "," + cn_ypos);
    		
    		for(int i = 1;i <= c_lv;i++)
        	{
        		System.out.print(" ");
        	}
    		double[] xpos = new double[1];
    		double[] ypos = new double[1];
        	switch (rt_quad)
        	{
        		case 1 : xpos = new double[] { cn_xpos,cn_xpos, cn_xpos + 1, cn_xpos + 1, cn_xpos + 1,cn_xpos,cn_xpos - 1,cn_xpos - 1,cn_xpos };
        		 		 ypos = new double[] { cn_ypos, cn_ypos + 1, cn_ypos + 1, cn_ypos, cn_ypos - 1,cn_ypos - 1,cn_ypos - 1,cn_ypos,cn_ypos };
        		 		 System.out.println("Draw : 1");
        		 		 break;
        		case 2 : xpos = new double[] { cn_xpos, cn_xpos + 1, cn_xpos +1, cn_xpos, cn_xpos - 1,cn_xpos - 1,cn_xpos - 1,cn_xpos,cn_xpos };
    	 		 		 ypos = new double[] { cn_ypos, cn_ypos, cn_ypos-1, cn_ypos-1, cn_ypos-1,cn_ypos,cn_ypos+1,cn_ypos+1,cn_ypos };
    	 		 		 System.out.println("Draw : 2");
    	 		 		 break;
        		case 3 : xpos = new double[] { cn_xpos , cn_xpos - 1, cn_xpos - 1, cn_xpos, cn_xpos + 1,cn_xpos + 1,cn_xpos + 1,cn_xpos,cn_xpos };
    	 		 		 ypos = new double[] { cn_ypos , cn_ypos, cn_ypos + 1, cn_ypos + 1, cn_ypos + 1,cn_ypos,cn_ypos - 1,cn_ypos - 1,cn_ypos };
    	 		 		System.out.println("Draw : 3");
    	 		 		 break;
        		case 4 : xpos = new double[] { cn_xpos, cn_xpos, cn_xpos - 1, cn_xpos - 1, 0,cn_xpos,cn_xpos + 1,cn_xpos + 1,cn_xpos };
    	 		 		 ypos = new double[] { cn_ypos, cn_ypos - 1, cn_ypos - 1, cn_ypos, cn_ypos + 1,cn_ypos + 1,cn_ypos + 1,cn_ypos,cn_ypos };
    	 		 		 System.out.println("Draw : 4");
    	 		 		 break;
        	}
        	for(int i = 1;i <= c_lv;i++)
        	{
        		System.out.print(" ");
        	}
        	System.out.println(Arrays.toString(xpos));
        	for(int i = 1;i <= c_lv;i++)
        	{
        		System.out.print(" ");
        	}
        	System.out.println(Arrays.toString(ypos));
    		StdDraw.polygon(xpos, ypos);
    		
    		
	
    	}
    	else
    	{
    		System.out.print("X");
    	}

    }
    
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StdDraw.setXscale(0, dimens);
		StdDraw.setYscale(0, dimens);
		
		double c_xpos = dimens / 2;
		double c_ypos = dimens / 2;
		double xpos = Math.round(Math.random() * 10) % dimens;
		double ypos = Math.round((Math.random() * 10)) % dimens;
		int c_quad = findquad(xpos,ypos,c_xpos,c_ypos);

		System.out.println("SP : " + xpos + " " + ypos);
		System.out.println("CP : " + c_xpos + " " + c_ypos);
		System.out.println("Q : " + c_quad);
		
		//Draw Start Square
		double[] s_xpos = { xpos, xpos + 1, xpos + 1, xpos, xpos };
		double[] s_ypos = { dimens - ypos, dimens - ypos, dimens - (ypos + 1),dimens - (ypos + 1), dimens - ypos };
		StdDraw.polygon(s_xpos, s_ypos);
		
		System.out.println("-----------------------");
		op(xpos,ypos,c_quad,dimens,0);
		System.out.println("");
		System.out.println("-----------------------");
		
	}

}
