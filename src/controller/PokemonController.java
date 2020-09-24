package controller;

//import java.io.Console;
import java.io.IOException;


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Bulbasaur;
import model.Charizard;
import model.Dragonite;
import model.Mew;
import model.Pikachu;

@WebServlet(urlPatterns = { "/pokemon" })
public class PokemonController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	//private static final String String= null;

	public PokemonController() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		RequestDispatcher rd = this.getServletContext().getRequestDispatcher("/WEB-INF/views/pokemon.jsp");
		rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String value1 = request.getParameter("card1"); 
		String value2 = request.getParameter("card2"); 
		String value3 = request.getParameter("card3"); 
		String value4 = request.getParameter("card4"); 
		String value5 = request.getParameter("card5"); 

		String msg = " ";

		if (value1 != null) {
			
			Bulbasaur obj1=new Bulbasaur(msg,0,msg,msg,msg,msg);
	        String name=obj1.getPokemonName();
	        int n=obj1.getPokemoNumber();
	        String ch=obj1.getCharacteristics();
	        String type=obj1.getType();
	        String ev=obj1.getEvolution();
	        String base=obj1.getBaseExp();
	       System.out.println(name);
	       System.out.println(ch);
	       System.out.print(type);
	       
		    msg = "<center>" + name + "  #"+n;
			request.setAttribute("message1",msg);
			request.setAttribute("character1",ch);
			request.setAttribute("type1",type);
			request.setAttribute("evolution1",ev);
			request.setAttribute("baseExp1", base);
		}

		if (value2 != null) {
			// Create the object for Charizard class and use getters to retrieve the values	
			
			Charizard obj2=new Charizard("Charizard",006,"\"Charizard is fit and strong and has the ability to soar up to ridiculous heights. With a single breath of fire, it can burn down forests and melt gigantic glaciers.",
					"FIRE","CHARMELEON","240");
	        String name=obj2.getPokemonName();
	        int n=obj2.getPokemoNumber();
	        String ch=obj2.getCharacteristics();
	        String type=obj2.getType();
	        String ev=obj2.getEvolution();
	        String base=obj2.getBaseExp();
			msg = "<center>" + name + "  #" + n;
			request.setAttribute("message2",msg);
			request.setAttribute("character2",ch);
			request.setAttribute("type2",type);
			request.setAttribute("evolution2",ev);
			request.setAttribute("baseExp2", base);
		}

		if (value3 != null) {
            Dragonite obj3=new Dragonite(msg,0,msg,msg,msg,msg);
            String name=obj3.getPokemonName();
	        int n=obj3.getPokemoNumber();
	        String ch=obj3.getCharacteristics();
	        String type=obj3.getType();
	        String ev=obj3.getEvolution();
	        String base=obj3.getBaseExp();
			msg = "<center>" + name + "  #" + n;
			request.setAttribute("message3",msg);
			request.setAttribute("character3",ch);
			request.setAttribute("type3",type);
			request.setAttribute("evolution3",ev);
			request.setAttribute("baseExp3",base);
		}
		if (value4 != null) {

			// Create the object for Mew class and use getters to retrieve the values	
			Mew obj4=new Mew(msg,0,msg,msg,msg,msg);
			    String name=obj4.getPokemonName();
		        int n=obj4.getPokemoNumber();
		        String ch=obj4.getCharacteristics();
		        String type=obj4.getType();
		        String ev=obj4.getEvolution();
		        String base=obj4.getBaseExp();
			msg = "<center>" + name + "  #" + n;
			request.setAttribute("message4",msg);
			request.setAttribute("character4",ch);
			request.setAttribute("type4",type);
			request.setAttribute("evolution4",ev);
			request.setAttribute("baseExp4",base);
		}

		if (value5 != null) {

			// Create the object for Pikachu class and use getters to retrieve the values	
/*getter*/
			Pikachu obj5=new Pikachu(msg,0,msg,msg,msg,msg);
			 String name=obj5.getPokemonName();
		        int n=obj5.getPokemoNumber();
		        String ch=obj5.getCharacteristics();
		        String type=obj5.getType();
		        String ev=obj5.getEvolution();
		        String base=obj5.getBaseExp();
			msg = "<center>" +  name + "  #" + n;
			request.setAttribute("message5",msg);
			request.setAttribute("character5",ch);
			request.setAttribute("type5",type);
			request.setAttribute("evolution5",ev);
			request.setAttribute("baseExp5",base);

		}

		RequestDispatcher rd = this.getServletContext().getRequestDispatcher("/WEB-INF/views/pokemon.jsp");
		rd.forward(request, response);

	}

	

}
