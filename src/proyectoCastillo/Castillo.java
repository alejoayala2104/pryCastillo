package proyectoCastillo;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Polyline;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.SVGPath;
import javafx.scene.shape.StrokeLineJoin;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Castillo extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		Scene scene = this.castillo();
		primaryStage.setTitle("Ejercicio Castillo");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	private Scene castillo() {		
		Pane root = new Pane();
		//Nombre
		Text nombre = new Text("ANDRÉS ALEJANDRO AYALA CHAMORRO - 219034431");
		nombre.setX(5);
		nombre.setY(30);
		nombre.setFont(Font.font("Helvetica", FontWeight.BOLD, 20));		
		//Nubes		
		//Nube 1
		SVGPath n1 = new SVGPath();
		n1.setContent("M186,475.667c0,0,9.167,0,10.5,9.667s-5.333,10.5-9.833,11.833c-1.667,2.333-7.834,3-9.667,2.5\r\n" + 
				"	c-0.167,3.167-9.167,9.333-17.667,4.333c-2.667,2.667-10.5,6.501-19.333-1.666c-2.833-0.834-6.166-1.834-6.833-5.667\r\n" + 
				"	c-3,0-11.167-2.667-10.5-11.333s6.833-9.667,9.5-9.667c1.833-2.167,7.667-3.5,9.5-2.5c0.5-2,7.468-10,17.984-4.5\r\n" + 
				"	c4.349-2.833,11.849-6.5,17.849,1.333C183.5,470.667,185,473,186,475.667z");
		n1.setFill(Color.web("D9FFFE"));
		n1.setStroke(Color.BLACK);
		//Nube 2
		SVGPath n2 = new SVGPath();
		n2.setContent("M78.5,407.5c0,0,13.75-19.25,31.75-3.25c4-6.5,23.75-15.25,30.75,1.75\r\n" + 
				"	c5.75-1,13.5,1.5,13.125,9.875c7.375-2.625,17.375,0.375,18.625,11.375c0.5,6,2.417,15.583-13.624,15.75\r\n" + 
				"	c-0.459,3.667-8.376,8-18.626,5.25c-3.5,5.75-15.667,17.75-31.083,7.417c0,0-8.917,7.208-17.917,6.458s-14.125-8.75-14.125-8.75\r\n" + 
				"	c-5.625,0.125-13-2-13.25-11c-5-0.125-14.75,0.125-17.375-9.625C45,424,47.875,415.5,60.875,414.25\r\n" + 
				"	C65.5,410.75,68.5,406.125,78.5,407.5z");
		n2.setFill(Color.web("D9FFFE"));
		n2.setStroke(Color.BLACK);
		Polyline n2l = new Polyline(89.833,446.75 ,94.75,450.25 ,99.25,451.833 ,102.75,452.5 ,107.667,453.333 ,112,453.333 
				,116.833,452.417 ,121.25,451.333 ,124.833,450.042 ,128.167,448.417 ,131,446.75);
		//Nube 3
		SVGPath n3 = new SVGPath();
		n3.setContent("M210,327.25c0,0,32-1.5,38-36.5c2-22-15.25-46.5-40.5-46c0,0-21.25-37.75-61.25-18.75\r\n" + 
				"	c-12.75-5-21.5-11.25-46-0.25c-6,4-13.5,9.25-19.25,23.5c-6.25,0-26,0.75-39,20c-3.25,6.25-11.5,22.25-5,37.75\r\n" + 
				"	c4.75,11,11.75,24,24.5,29c10.25,3.5,17,6.25,27.75,2.25c8.5,8.5,13,13.75,28.5,17.5c16.5,0.25,20.625,1.875,34.5-8.375\r\n" + 
				"	c7.625,2.375,20.25,6.75,32.125,1.375C193.5,344.375,204.125,341.25,210,327.25z");
		n3.setFill(Color.web("D9FFFE"));
		n3.setStroke(Color.BLACK);
		Polyline n3l1 = new Polyline(72.333,323.833 ,77.167,328.333 ,80.5,330.333 ,83.833,331.833 ,88.333,333.333 ,92.833,334.333 
				,96.667,334.333 ,101.5,334.333 ,106.667,333.333 ,110.333,332.5 ,113.833,330.5);
		Polyline n3l2 = new Polyline(132.5,336.833 ,135.833,339.667 ,139,341.333 ,142.333,342.667 ,145.667,343.667 ,149,344.375 
				,152.688,344.813 ,157.5,344.281 ,162.094,342.813 ,165.906,341.344 ,169.063,340.125 ,172.5,338.344 ,174.469,337.031);
		//Nube 4
		SVGPath n4 = new SVGPath();
		n4.setContent("M235.5,469.5c0,0-45.5-5.25-45-68.5s72.5-71.917,72.5-71.917l33.5,5.25c0,0,40.25-64.083,99.25-11.583\r\n" + 
				"	C418,373,406,469.5,406,469.5H235.5z");
		n4.setFill(Color.web("D9FFFE"));
		n4.setStroke(Color.BLACK);
		//Nube 5
		SVGPath n5 = new SVGPath();
		n5.setContent("M401.625,227.75c0,0,5.375,3.375,8.625-2.5c0,0,9.5,0.875,10.625-9.25s-9.625-11.125-9.625-11.125\r\n" + 
				"	s-2.625-6.875-7.75-5.625c-2.625-3.25-10.125-9-19-2.25c-7.625-2-11.75-3.125-17.25,4c-5.25,0.125-6-1.125-9.25,2.5\r\n" + 
				"	c-3.25-0.125-10.375,2.375-11,10.5c-0.125,7.125,10.5,10.75,10.5,10.75s0.5,7.5,8.75,5.625c3.625,4.125,11.081,7.125,17.728,1.875\r\n" + 
				"	C390.5,235,398.25,235.125,401.625,227.75z");
		n5.setFill(Color.web("D9FFFE"));
		n5.setStroke(Color.BLACK);
		//Nube 6
		SVGPath n6 = new SVGPath();
		n6.setContent("M487.75,84.25c0,0,26.25-25.25,53.25,8.25c4.75,1.25,17.5-0.5,20.25,20.5c4.75,0,24,0,27.5,20.75\r\n" + 
				"	c0,34-28.25,29.25-28.25,29.25s-7.5,10.5-23.75,5.25c-6.5,9-34,9-34,9H477c0,0-30.25,21.5-52.75-11c-11.75-1.25-19.5-8.25-20-20.5\r\n" + 
				"	c-17.75,1-27.25-7.75-29.5-25.5c-0.5-16.5,11.5-27.75,28.25-24.25c11.25-12,24.5-7.5,30.5-4.5\r\n" + 
				"	C438.75,81.75,463.25,61.75,487.75,84.25z");
		n6.setFill(Color.web("D9FFFE"));
		n6.setStroke(Color.BLACK);
		//Nube 7
		SVGPath n7 = new SVGPath();
		n7.setContent("M554.75,215.75c0,0,14.75-11.75,35.75-3.5c9.5-13,31.75-30.688,59.5,0.281\r\n" + 
				"	c7.25,0.969,19.25,3.219,21.25,20.969c14.25-0.25,25.75,5.25,27.5,25.75c1,19-16.75,25-27,23.25c-5.75,5.25-16,12.25-31,4.75\r\n" + 
				"	c-7.25,11.25-18.25,18-30.5,17.25s-41.5-9-41.5-9L554.75,215.75z");
		n7.setFill(Color.web("D9FFFE"));
		n7.setStroke(Color.BLACK);
		Polyline n7l1 = new Polyline(641.375,254.875 ,645.417,258 ,648.417,260 ,651.5,261.583 ,654.167,262.583 ,658.917,263.667 
				,662.75,263.667 ,665.75,262.917 ,669.417,261.667 ,672.667,260.167 ,676.083,258.417 ,679.833,256.583);
		Polyline n7l2 = new Polyline(621,275.583 ,623,277.583 ,625.333,279.417 ,627.5,280.667 ,630,281.583 ,632.75,282.583 
				,636.333,283.167 ,640.083,283.667 ,644.417,283.333 ,649.167,282.167 ,652.833,281 ,655.917,279.625 ,657.833,278.583 ,659.583,277.667);
		//Nube 8
		SVGPath n8 = new SVGPath();
		n8.setContent("M653.25,148c0,0,5.75-10.75,18-4c4.75-3.75,12-5.477,17.25,0.887c4.75,0.863,8.5,3.613,8.25,7.613\r\n" + 
				"	c5.5-1,13,5.5,11,11.25c-0.417,3.417-1.833,8.084-9.583,8.667c-3.167,3.417-6.083,4.417-9.75,2.917c-1.75,3.75-7.5,9.75-18.25,4.417\r\n" + 
				"	c-3.834,4.75-16.167,4.083-18.167-2.167c-3.083,0-8.001-2-7.417-5.5c-3.166-0.167-11.03-3.917-10.938-9.769\r\n" + 
				"	c0.522-6.065,2.438-10.731,10.188-10.731C646.167,145.917,653.25,148,653.25,148z");;
		n8.setFill(Color.web("D9FFFE"));
		n8.setStroke(Color.BLACK);
		//Nube 9
		SVGPath n9 = new SVGPath();
		n9.setContent("M740.25,155c0,0,5-9.25,17.25-4.75c6-4,13-3.984,18,1.758c5,0.242,6.75,2.742,8,6.242\r\n" + 
				"	c4.5,0,11.5,1.5,10.25,13.25c-0.5,6.5-9,7.75-9,7.75s-5,2.75-9.5,2.25c-2.25,4-7.75,7.5-17,5c-4.5,2.25-14,4.75-18-2\r\n" + 
				"	c-4-0.5-9.375-2.625-9.75-5.625c-3.5-0.375-12-4.542-9.417-15.958c3.167-7.583,9.667-5.792,9.667-5.792S735,152.625,740.25,155z");
		n9.setFill(Color.web("D9FFFE"));
		n9.setStroke(Color.BLACK);
		//Nube 10
		SVGPath n10 = new SVGPath();
		n10.setContent("M839,234c0,0,25.667-27.666,45.667,3.667c8.667,2,17.667,8.333,15,16.333c10,1,19.333,3.667,21,19\r\n" + 
				"	c2,15.333-12.999,25-23.333,21.667c-5,3-15.001,9.333-23.334,2.333c-4,5-7.666,10-22.333,10c-14.667-0.333-22.333-10-22.333-10\r\n" + 
				"	s-25.539,4-35.437-25.333C784.667,242.667,818,222.667,839,234z");
		n10.setFill(Color.web("D9FFFE"));
		n10.setStroke(Color.BLACK);
		Polyline n10l = new Polyline(849,285 ,853.5,288.5 ,858.25,291 ,862,292.5 ,867.75,293.75 ,872.75,293.75 ,877,292.25 ,881.25,290.5 
				,886,287.75 ,890,285);
		//Nube 11
		SVGPath n11 = new SVGPath();
		n11.setContent("M836,334c0,0,41-1.5,37.5,39c23.5,0,47.5,0.5,54,45.5S877,461,877,461s-37.5,27-52.5,8.5\r\n" + 
				"	c1.5,18-24.5,54-38.5,54s-187-21-187-21l9.5-73.753l13-23.247c0,0-9-63,67.5-79c27.5,21,28.5,16,28.5,16S769,252,836,334z");
		n11.setFill(Color.web("D9FFFE"));
		n11.setStroke(Color.BLACK);
		//Nube 12
		SVGPath n12 = new SVGPath();
		n12.setContent("M813.333,436.333c0,0,20.001,2,21.334,21c11,0.333,31.667,7.333,27,29.667S839,507.334,835,506.667\r\n" + 
				"	c-3.333,4-10.001,12.666-30.667,4.666c-5,9-7,14-7,14l-40-15.333l-17-41.333c0,0,1.666-20,2-21s10.334-5.333,10.334-5.333\r\n" + 
				"	S775.333,393.333,813.333,436.333z");
		n12.setFill(Color.web("D9FFFE"));
		n12.setStroke(Color.BLACK);
		//Nube 13
		SVGPath n13 = new SVGPath();
		n13.setContent("M869.5,391.75c0,0,11.25-7.75,17.75,2.5c5,0.5,7.75,2.25,7.75,5.5c4.5,0.5,10.5,1.5,11,10\r\n" + 
				"	c-1.5,7.75-5.75,10.5-9.25,10.75c-2.5,2.5-6.25,3.75-11,3.5c-1.75,3.5-8.25,9-16.25,4c-3.75,2.5-11.75,5-18.75-1.5\r\n" + 
				"	c-5.25-0.75-8.5-2.5-8.5-6.25c-4-0.5-10.25-2.423-11.5-10.461s6.5-11.039,10.75-10.789c4.5-3.75,6.25-3.75,8.75-3.25\r\n" + 
				"	C853.5,392.25,861.25,386,869.5,391.75z");
		n13.setFill(Color.web("D9FFFE"));
		n13.setStroke(Color.BLACK);
		//Nube 14
		SVGPath n14 = new SVGPath();
		n14.setContent("M941.418,502.195c0,0-9.069-12.697-20.941-2.145c-2.639-4.287-15.665-10.058-20.282,1.154\r\n" + 
				"	c-3.792-0.659-8.904,0.99-8.656,6.514c-4.865-1.731-11.461,0.247-12.285,7.502c-0.329,3.958-1.594,10.279,8.986,10.389\r\n" + 
				"	c0.304,2.418,5.524,5.277,12.285,3.463c2.309,3.793,10.334,11.707,20.502,4.893c0,0,5.881,4.754,11.817,4.26\r\n" + 
				"	c5.936-0.495,9.316-5.771,9.316-5.771c3.71,0.082,8.574-1.319,8.739-7.256c3.298-0.082,9.729,0.082,11.46-6.348\r\n" + 
				"	c1.154-5.771-0.742-11.378-9.316-12.203C949.992,504.338,948.014,501.288,941.418,502.195z");
		n14.setFill(Color.web("D9FFFE"));
		n14.setStroke(Color.BLACK);		
		
		//Piso
		SVGPath piso = new SVGPath();
		piso.setContent("M184,788c0,0-120,14-111,70.5C74.5,865,79,958,384,985c73,5,403.333,18.999,517-48c39-21.001,162-121-93-154\r\n" + 
				"	C757,781,184,788,184,788z");
		piso.setFill(Color.web("4FC172"));
		piso.setStroke(Color.BLACK);
		
		//Caminito
		SVGPath cami = new SVGPath();
		cami.setContent("M681,985.5C621,962,550.497,895,550.497,895s-61.997,0-100.5,0c42.997,94.5,114.503,94.701,114.503,94.701");
		cami.setFill(Color.web("FFCC66"));
		cami.setStroke(Color.BLACK);
		
		//Arbusto atras
		SVGPath arbst = new SVGPath();
		arbst.setContent("M87.5,716c0,0-63.5-18-70.167-83.333c0-82.667,87-94.667,106.333-76.667c0,0,27.333-57.666,85.333-24.666\r\n" + 
				"	L757,551c0,0,81.999-47.999,110.333,11.667c6,0.666,34-3.834,33,43.583c9,10.75,43.335,61.25,6.501,84.25\r\n" + 
				"	c-31.834,30,5.666,126,5.666,126H711H184C184,816.5,91,868.333,87.5,716z");
		arbst.setFill(Color.web("1E7338"));
		arbst.setStroke(Color.BLACK);
		
		//Arboles
		//Arbol izq izq
		SVGPath aii = new SVGPath();
		aii.setContent("M96.375,827.75V791.5c0,0-23.375-0.333-28.375-33.167c-0.691-19,1.687-41.099,25.333-50.333\r\n" + 
				"	C121.5,697,129,726.667,129,726.667s10.167,48.5-26,64.666l0.167,36.417H96.375z");
		aii.setFill(Color.web("4FC172"));
		aii.setStroke(Color.BLACK);
		Circle aiic1 = new Circle(107.5,760.25,8.75,Color.web("FFCC66")); aiic1.setStroke(Color.BLACK);
		Circle aiic2 = new Circle(85,745.75,8.75,Color.web("FFCC66")); aiic2.setStroke(Color.BLACK);
		Circle aiic3 = new Circle(109.33,723.083,8.75,Color.web("FFCC66")); aiic3.setStroke(Color.BLACK);
		Rectangle aiir = new Rectangle(93.75,826.334,14.75,6.083); aiir.setFill(Color.web("4FC172"));
		
		//Arbol izq medio
		SVGPath aim = new SVGPath();
		aim.setContent("M137.625,812.875V758.75c0,0-40.625-14.416-42.125-62.916\r\n" + 
				"	c-0.5-25.167,10.292-49.708,37.625-59.584c12-4.125,37.708-5.416,49.875,25.333c7,23.084,4.667,55.417,4.667,55.417\r\n" + 
				"	s-1.624,12.595-3.167,16.501c-5.333,13.5-38.917,25.249-38.917,25.249v54.125");
		aim.setFill(Color.web("4FC172"));
		aim.setStroke(Color.BLACK);
		Circle aimc1 = new Circle(131.75,697.5,8.75,Color.web("FFCC66")); aimc1.setStroke(Color.BLACK);
		Circle aimc2 = new Circle(156.333,672.583,8.75,Color.web("FFCC66")); aimc2.setStroke(Color.BLACK);
		Circle aimc3 = new Circle(121.833,670.333,8.75,Color.web("FFCC66")); aimc3.setStroke(Color.BLACK);
		Circle aimc4 = new Circle(142.083,650.583,8.75,Color.web("FFCC66")); aimc4.setStroke(Color.BLACK);
		Rectangle aimr = new Rectangle(134.746,811.167,14.75,6.083); aimr.setFill(Color.web("4FC172"));
		
		//Arbol izq der
		SVGPath aid = new SVGPath();
		aid.setContent("M168.25,803.125V768.75c0,0-25.5,2.25-30-40.5c-2-39.75,35.75-50,44.75-41.75c0,0,4.583,3.5,11.265,18.311\r\n" + 
				"	c9.227,20.452,17.905,51.137-19.265,63.689v34.625H168.25z");
		aid.setFill(Color.web("4FC172"));
		aid.setStroke(Color.BLACK);
		Circle aidc1 = new Circle(156.833,741.667,8.75,Color.web("FFCC66")); aidc1.setStroke(Color.BLACK);
		Circle aidc2 = new Circle(169.333,710.5,8.75,Color.web("FFCC66")); aidc2.setStroke(Color.BLACK);		
		Rectangle aidr = new Rectangle(163.746,801.667,14.75,6.083); aidr.setFill(Color.web("4FC172"));
		
		//Arbol der izq
		SVGPath adi = new SVGPath();
		adi.setContent("M853,812.167l0.167-53.5c0,0-43.556,3.083-43.5-62.334C809.721,633.302,862.5,637,862.5,637\r\n" + 
				"	s44.167-0.108,39.25,59.25c-6,56.5-40.25,62-40.25,62v53.917");
		adi.setFill(Color.web("4FC172"));
		adi.setStroke(Color.BLACK);
		Circle adic1 = new Circle(834.084,723.25,8.75,Color.web("FFCC66")); adic1.setStroke(Color.BLACK);
		Circle adic2 = new Circle(858.834,703.25,8.75,Color.web("FFCC66")); adic2.setStroke(Color.BLACK);		
		Circle adic3 = new Circle(835.834,675,8.75,Color.web("FFCC66")); adic3.setStroke(Color.BLACK);
		Circle adic4 = new Circle(875.334,667.75,8.75,Color.web("FFCC66")); adic4.setStroke(Color.BLACK);	
		Circle adic5 = new Circle(869.334,730.25,8.75,Color.web("FFCC66")); adic5.setStroke(Color.BLACK);
		Rectangle adir = new Rectangle(849.524,809.125,14.75,6.083); adir.setFill(Color.web("4FC172"));
				
		//Arbol der der
		SVGPath add = new SVGPath();
		add.setContent("M932.5,837.25l0.167-154.083c0,0-39.917-3.167-42.667-61.417\r\n" + 
				"	c-3.061-64.826,57.75-61.75,57.75-61.75s38.417,1.392,33.5,60.75c-6,56.5-40.25,63-40.25,63v153.5");
		add.setFill(Color.web("4FC172"));
		add.setStroke(Color.BLACK);
		Circle addc1 = new Circle(906.834,638,8.75,Color.web("FFCC66")); addc1.setStroke(Color.BLACK);
		Circle addc2 = new Circle(951.334,649.5,8.75,Color.web("FFCC66")); addc2.setStroke(Color.BLACK);		
		Circle addc3 = new Circle(935.084,611.25,8.75,Color.web("FFCC66")); addc3.setStroke(Color.BLACK);
		Circle addc4 = new Circle(963.834,606.25,8.75,Color.web("FFCC66")); addc4.setStroke(Color.BLACK);	
		Circle addc5 = new Circle(928.334,582,8.75,Color.web("FFCC66")); addc5.setStroke(Color.BLACK);
		Rectangle addr = new Rectangle(929.024,834.125,14.75,6.083); addr.setFill(Color.web("4FC172"));
		
		//Arbol der medio
		SVGPath adm = new SVGPath();
		adm.setContent("M909.167,855.333v-49.666c0,0-41.473,1.5-41.417-63.917C867.804,678.719,918.5,684,918.5,684\r\n" + 
				"	s44.167-0.108,39.25,59.25c-6,56.5-40.25,62-40.25,62v50.083");
		adm.setFill(Color.web("4FC172"));
		adm.setStroke(Color.BLACK);
		Circle admc1 = new Circle(890.834,724.75,8.75,Color.web("FFCC66")); admc1.setStroke(Color.BLACK);
		Circle admc2 = new Circle(926.084,706,8.75,Color.web("FFCC66")); admc2.setStroke(Color.BLACK);		
		Circle admc3 = new Circle(938.584,737.75,8.75,Color.web("FFCC66")); admc3.setStroke(Color.BLACK);
		Circle admc4 = new Circle(911.334,753,8.75,Color.web("FFCC66")); admc4.setStroke(Color.BLACK);	
		Circle admc5 = new Circle(891.834,774.25,8.75,Color.web("FFCC66")); admc5.setStroke(Color.BLACK);
		Circle admc6 = new Circle(929.834,779,8.75,Color.web("FFCC66")); admc6.setStroke(Color.BLACK);	
		Rectangle admr = new Rectangle(906.333,853,14.75,6.083); admr.setFill(Color.web("4FC172"));
				
		//Sol base
		Circle sb = new Circle(220,180,84.5);
		sb.setFill(Color.web("ffe245"));
		sb.setStroke(Color.BLACK);
		//Sol ojo izq
		Circle soi = new Circle(175.8,172,12);
		soi.setFill(Color.BLACK);
		//Sol ojo izq pupila
		Circle soip = new Circle(176,163,5);
		soip.setFill(Color.web("ffe245"));
		//Sol ojo der
		Circle sod = new Circle(250,149,12);
		sod.setFill(Color.BLACK);
		//Sol ojo der pupila
		Circle sodp = new Circle(252,140,5);
		sodp.setFill(Color.web("ffe245"));
		//Sol mejilla izq
		Circle smi = new Circle(173,214,15);
		smi.setFill(Color.web("ed5e7b"));
		smi.setStroke(Color.BLACK);
		//Sol mejilla der
		Circle smd = new Circle(273,177,15);
		smd.setFill(Color.web("ed5e7b"));
		smd.setStroke(Color.BLACK);
		//Sol lineas
		Line sl1 = new Line(348.667,85.333,280,137.667);
		Line sl2 = new Line(348.667,182,286,176);
		Line sl3= new Line(356.333,256.333,280,216.535);
		Line sl4 = new Line(263.667,283.667,246.333,245.667);
		Line sl5 = new Line(102.333,204.333,147,196);
		Line sl6 = new Line(59.667,146,147,152.667);
		Line sl7 = new Line(128,71,166.777,115.155);
		Line sl8 = new Line(217.667,30.667,217.667,97.667);
		Line sl9 = new Line(277,71,255,108);
		//Sol sonrisa
		SVGPath ss1 = new SVGPath();
		ss1.setContent("M251,191c0,0-1.167,5.167,4,5.833");		
		ss1.setStroke(Color.BLACK);
		
		SVGPath ss2 = new SVGPath();
		ss2.setContent("M199.75,208.25c0,0,2.5,3.75-1.125,6.5");		
		ss2.setStroke(Color.BLACK);	
		
		Polyline ss3 = new Polyline(200.574,211.485 ,205,213.75 ,211.375,214.75 ,217.125,214.75 ,223.125,213.875 ,230.625,211.5 
				,236.375,209 ,240.375,206.25 ,245.25,202.5 ,248.5,199.625 ,250.887,197.25 ,251.893,195.318);
		
		//Torre izq soporte
		Polygon tis = new Polygon(250.0,432.0,
								  250.0,390.0,
								  315.0,390.0,
								  315.0,432.0);
		tis.setFill(Color.web("e9d79b"));
		tis.setStroke(Color.BLACK);
		tis.setStrokeLineJoin(StrokeLineJoin.ROUND);
		
		//Torre izq techo
		SVGPath tit = new SVGPath();
		tit.setContent("M345.068,388c-6.813-8.294-13.898-6.835-60.125-112.098c-0.006-0.1-0.016-0.254-0.029-0.463l0.043-23.063\r\n" + 
				"	c0,0,12.039-2.5,13.832-16.75c0.297-6.375-3.074-16.875-15.754-17.75s-19.865,7.375-19.596,19.625c0,0,0.17,11.833,12.637,14.833\r\n" + 
				"	c0,6.356,0,22.13,0,23.588C229.859,381.165,222.772,379.707,215.96,388c-5.979,5.635,4.014,5.5,4.014,5.5h64.569h4.318h52.193\r\n" + 
				"	C341.055,393.5,351.047,393.635,345.068,388z");
		tit.setFill(Color.web("00c5c4"));
		tit.setStroke(Color.BLACK);
		//Torre izq techo LINEAS
		Polyline titl1 = new Polyline(232.182,366.75 ,259.75,388 ,284.5,366.75 ,308.25,388 ,330.683,369.773);
		Polyline titl2 = new Polyline(246.122,340.749 ,260,353.75 ,284,333.25 ,308.5,353.75 ,317.462,345.822);
		Polyline titl3 = new Polyline(258.545,314.847 ,281.792,298.5 ,301.954,313.704);
		titl1.setStrokeWidth(0.2);
		titl2.setStrokeWidth(0.2);
		titl3.setStrokeWidth(0.2);
		
		//Torre der soporte
		Polygon tds = new Polygon(682.0,432.0,
								  682.0,390.0,
								  747.0,390.0,
								  747.0,432.0);
		tds.setFill(Color.web("e9d79b"));
		tds.setStroke(Color.BLACK);
		tds.setStrokeLineJoin(StrokeLineJoin.ROUND);	
		
		//Torre der techo
		SVGPath tdt = new SVGPath();
		tdt.setContent("M781.148,388c-6.813-8.294-13.898-6.835-60.125-112.098c-0.006-0.1-0.016-0.254-0.028-0.463l0.042-23.063\r\n" + 
				"	c0,0,12.039-2.5,13.832-16.75c0.298-6.375-3.073-16.875-15.754-17.75c-12.679-0.875-19.864,7.375-19.595,19.625\r\n" + 
				"	c0,0,0.169,11.833,12.636,14.833c0,6.356,0,22.13,0,23.588C665.939,381.165,658.853,379.707,652.041,388\r\n" + 
				"	c-5.979,5.635,4.014,5.5,4.014,5.5h64.569h4.317h52.193C777.135,393.5,787.127,393.635,781.148,388z");
		tdt.setFill(Color.web("00c5c4"));
		tdt.setStroke(Color.BLACK);
		//Torre der techo LINEAS
		Polyline tdtl1 = new Polyline(667.167,368 ,691.167,388 ,716.595,367.333 ,739.334,388 ,764.793,366.524);
		Polyline tdtl2 = new Polyline(680.865,343.417 ,691.001,353.833 ,716.595,333 ,739.667,353.833 ,751.924,342.621 );
		Polyline tdtl3 = new Polyline(694.858,314.345 ,716.595,298.667 ,738.331,314.345);
		tdtl1.setStrokeWidth(0.2);
		tdtl2.setStrokeWidth(0.2);
		tdtl3.setStrokeWidth(0.2);
		
		
		//Castillo parte atras
		Polygon cpa = new Polygon(213.0,580.0,
								  213.0,623.0,
								  780.0,623.0,
								  780.0,580.0);
		cpa.setFill(Color.web("e9d79b"));
		cpa.setStroke(Color.BLACK);
		cpa.setStrokeLineJoin(StrokeLineJoin.ROUND);	
		
		//Castillo base
		Polygon cb = new Polygon(182.0,604.0,
								 182.0,888.0,
								 809.0,888.0,
								 809.0,604.0,
								 764.0,604.0,
								 764.0,621.0,
								 738.0,621.0,
								 738.0,604.0,
								 697.0,604.0,
								 697.0,621.0,
								 674.0,621.0,
								 674.0,604.0,
								 321.0,604.0,
								 321.0,621.0,
								 292.0,621.0,
								 292.0,604.0,
								 251.0,604.0,
								 251.0,621.0,
								 228.0,621.0,
								 228.0,604.0);
		cb.setFill(Color.web("e9d79b"));
		cb.setStroke(Color.BLACK);
		cb.setStrokeLineJoin(StrokeLineJoin.ROUND);
		
		int factor = 3;
		//Castillo segundo piso
		Polygon csp = new Polygon(388.0-factor,261.0,
								  388.0-factor,420.0,
								  616.0-factor,420.0,
								  616.0-factor,261.0,
								  583.0-factor,261.0,
								  583.0-factor,284.0,
								  567.0-factor,284.0,
								  567.0-factor,261.0,
								  535.0-factor,261.0,
								  535.0-factor,284.0,
								  519.0-factor,284.0,
								  519.0-factor,261.0,
								  486.0-factor,261.0,
								  486.0-factor,284.0,
								  470.0-factor,284.0,
								  470.0-factor,261.0,
								  437.0-factor,261.0,
								  437.0-factor,284.0,
								  421.0-factor,284.0,
								  421.0-factor,261.0);
		csp.setFill(Color.web("e9d79b"));
		csp.setStroke(Color.BLACK);
		csp.setStrokeLineJoin(StrokeLineJoin.ROUND);	
		
		//Castillo principal techo medio		
		Polygon cptm = new Polygon(240.0,432.0,
								   154.0,580.0,
								   843.0,580.0,
								   756.0,432.0);
		cptm.setFill(Color.web("00c5c4"));
		cptm.setStroke(Color.BLACK);
		cptm.setStrokeLineJoin(StrokeLineJoin.ROUND);	
		//Castillo principal techo medio LINEAS
		Polyline cptml1 = new Polyline(166.667,558.834, 198,539, 225.333,559.667, 256.5,539, 284.333,559.667, 315.833,539, 343.167,559.667,
				374.667,539, 614,539, 649.001,559.667, 681.001,539, 708.334,559.667, 740.001,539, 767.001,559.667, 798.834,539, 831,559.667);
		Polyline cptml2 = new Polyline(189.25,518.75 ,221.25,498 ,248.5,518.75 ,280.25,498 ,307.5,518.75 ,339.25,498 ,366,518.75 
				,623.333,518.75 ,656,498 ,683.333,518.75 ,715.333,498 ,742.333,518.75 ,773.667,498 ,807.667,518.75 );
		Polyline cptml3 = new Polyline(210,482.75 ,244.5,461.25 ,271.75,482.75 ,303.75,461.25 ,331.5,482.75 ,365,461.25 ,635,461.25 ,661,482.75 
				,693,461.25 ,720,482.75 ,752.5,461.25 ,785.25,482.75);
		Polyline cptml4 = new Polyline(252.25,433.25 ,276.5,455 ,300.25,433.25 ,324,455 ,349,433.25 ,370,455 ,625.667,455 ,650.667,433.25 
				,675,455 ,698.667,433.25 ,722.667,455 ,752.334,433.25);
		cptml1.setStrokeWidth(0.2);
		cptml2.setStrokeWidth(0.2);
		cptml3.setStrokeWidth(0.2);
		cptml4.setStrokeWidth(0.2);
		
		//Castillo principal techo arriba
		SVGPath cpta = new SVGPath();
		cpta.setContent("M601,267c0,0-37.667-45.667-96.333-180.333c0.073-10.482,0.13-48.683,0.143-57.73\r\n" + 
				"	c1.989-1.475,3.284-3.833,3.284-6.499c0-4.471-3.624-8.094-8.094-8.094c-4.471,0-8.094,3.623-8.094,8.094\r\n" + 
				"	c0,2.768,1.391,5.209,3.51,6.668V86.75c0,0-38.917,121.25-94.417,181.25c0,27.5,6,25.75,6,25.75h196L601,267z");
		cpta.setFill(Color.web("00c5c4"));
		cpta.setStroke(Color.BLACK);
		//Castillo principal techo arriba
		Polyline cptal1 = new Polyline(429.201,230.75 ,456,252 ,479.5,230.75 ,504.5,252 ,528,230.75 ,553,252 ,576.873,230.75);
		Polyline cptal2 = new Polyline(443.685,206.38 ,455.5,217.25 ,480,196.5 ,504,217.25 ,528.334,196.5 ,553,217.25 ,563.117,206.875);
		Polyline cptal3 = new Polyline(453.244,188.309 ,479.75,165 ,504.375,186.625 ,528.625,165 ,550.757,183.877);
		Polyline cptal4 = new Polyline(478.625,131.125 ,504.375,152.125 ,524.733,131.125);
		Polyline cptal5 = new Polyline(487.375,110.375 ,502,123 ,515.187,110.375);
		cptal1.setStrokeWidth(0.2);
		cptal2.setStrokeWidth(0.2);
		cptal3.setStrokeWidth(0.2);
		cptal4.setStrokeWidth(0.2);
		cptal5.setStrokeWidth(0.2);
		
		//Bandera
		SVGPath band = new SVGPath();
		band.setContent("M504.584,26.979c2.24-0.525,3.713-0.432,5.913-1.077c1.948-0.571,3.503-1.277,5.871-0.405\r\n" + 
				"	c3.124,1.15,7.58,4.273,8.639,7.621c0.68,2.15-0.022,3.665-0.976,5.507c-1.54,2.976,1.48,3.412,3.941,3.25\r\n" + 
				"	c4.404-0.289,7.77-3.501,11.687-5.125c3.761-1.56,8.114-3.435,12.216-2.094c4.313,1.41,8.581,2.292,12.757,4.219\r\n" + 
				"	c3.94,1.819,8.17,2.969,11.986,4.625c4.379,1.899,9.629,1.063,13.632-1.257c1.661-0.963,3.281-2.257,5.122-2.774\r\n" + 
				"	c2.941-0.825,2.967,3.095,1.979,5.021c-1.915,3.729-5.736,5.643-9.601,6.642c-9.111,2.355-17.981-0.649-26.844-2.385\r\n" + 
				"	c-4.75-0.931-10.148-1.915-14.906-0.497c-3.869,1.153-7.112,3.587-10.75,5.333c-6.909,3.317-18.634,2.604-23.833-3.5\r\n" + 
				"	c-0.595-0.699-1.388-2.786-1.765-3.611c-0.401-0.882,1.167-2.354,0.765-3.222c-1.017-2.196-4.608,0.927-6.167,1.417\r\n" + 
				"	c-1.691,0.53-3.159-3.292-3.503-4.788c-0.52-2.259,0.79-2.644,1.836-4.212c1.194-1.792,0.102-3.028-0.776-4.583\r\n" + 
				"	c-0.488-0.864-0.596-1.681,0.037-2.617C502.28,27.821,503.479,27.021,504.584,26.979");
		band.setFill(Color.web("D05E79"));
		band.setStroke(Color.BLACK);
		band.setStrokeWidth(1);
		
		//Castillo principal frente		
		Polygon cpf = new Polygon(350.0,388.0,
								  350.0,895.0,
								  647.0,895.0,
								  647.0,388.0,
								  602.0,388.0,
								  602.0,411.0,
								  584.0,411.0,
								  584.0,388.0,
								  539.0,388.0,
								  539.0,411.0,
								  521.0,411.0,
								  521.0,388.0,
								  476.0,388.0,
								  476.0,411.0,
								  458.0,411.0,
								  458.0,388.0,
								  413.0,388.0,
								  413.0,411.0,
								  395.0,411.0,
								  395.0,388.0,
								  350.0,388.0);
		cpf.setFill(Color.web("e9d79b"));
		cpf.setStroke(Color.BLACK);
		cpf.setStrokeLineJoin(StrokeLineJoin.ROUND);
		
		//Ventanas pequeñas medio
		SVGPath vp1 = new SVGPath();
		vp1.setContent("M216.583,659.625v28.916h21.5v-28.916c0,0,1.042-9.75-10.75-9.75\r\n" + 
				"	C216,649.875,216.583,659.625,216.583,659.625z");
		vp1.setFill(Color.web("D05E79"));
		vp1.setStroke(Color.BLACK);
		
		SVGPath vp2 = new SVGPath();
		vp2.setContent("M263.917,659.625v28.916h21.5v-28.916c0,0,1.042-9.75-10.75-9.75\r\n" + 
				"	C263.333,649.875,263.917,659.625,263.917,659.625z");
		vp2.setFill(Color.web("D05E79"));
		vp2.setStroke(Color.BLACK);
		
		SVGPath vp3 = new SVGPath();
		vp3.setContent("M310.445,659.625v28.916h21.5v-28.916c0,0,1.042-9.75-10.75-9.75\r\n" + 
				"	C309.861,649.875,310.445,659.625,310.445,659.625z");
		vp3.setFill(Color.web("D05E79"));
		vp3.setStroke(Color.BLACK);
		
		SVGPath vp4 = new SVGPath();
		vp4.setContent("M666.584,659.625v28.916h21.5v-28.916c0,0,1.041-9.75-10.75-9.75\r\n" + 
				"	C666,649.875,666.584,659.625,666.584,659.625z");
		vp4.setFill(Color.web("D05E79"));
		vp4.setStroke(Color.BLACK);
		
		SVGPath vp5 = new SVGPath();
		vp5.setContent("M713.25,659.625v28.916h21.5v-28.916c0,0,1.041-9.75-10.75-9.75\r\n" + 
				"	C712.666,649.875,713.25,659.625,713.25,659.625z");
		vp5.setFill(Color.web("D05E79"));
		vp5.setStroke(Color.BLACK);
		
		SVGPath vp6 = new SVGPath();
		vp6.setContent("M759.583,659.625v28.916h21.5v-28.916c0,0,1.041-9.75-10.75-9.75\r\n" + 
				"	C758.999,649.875,759.583,659.625,759.583,659.625z");
		vp6.setFill(Color.web("D05E79"));
		vp6.setStroke(Color.BLACK);
		
		//Ventanas pequeñas arriba
		SVGPath vp7 = new SVGPath();
		vp7.setContent("M443.333,329.875v28.916h21.5v-28.916c0,0,1.041-9.75-10.75-9.75\r\n" + 
				"	C442.749,320.125,443.333,329.875,443.333,329.875z");
		vp7.setFill(Color.web("D05E79"));
		vp7 .setStroke(Color.BLACK);
		
		SVGPath vp8 = new SVGPath();
		vp8.setContent("M489.833,329.875v28.916h21.5v-28.916c0,0,1.041-9.75-10.75-9.75\r\n" + 
				"	C489.249,320.125,489.833,329.875,489.833,329.875z");
		vp8.setFill(Color.web("D05E79"));
		vp8.setStroke(Color.BLACK);
		
		SVGPath vp9 = new SVGPath();
		vp9.setContent("M536.083,329.875v28.916h21.5v-28.916c0,0,1.041-9.75-10.75-9.75\r\n" + 
				"	C535.499,320.125,536.083,329.875,536.083,329.875z");
		vp9.setFill(Color.web("D05E79"));
		vp9.setStroke(Color.BLACK);
		
		//Ventanas grandes
		//V izq
		SVGPath vg1 = new SVGPath();
		vg1.setContent("M383.588,672.734v55.557h41.411v-55.557c0,0,2.005-18.734-20.705-18.734\r\n" + 
				"	C382.462,654,383.588,672.734,383.588,672.734z");
		vg1.setFill(Color.web("D05E79"));
		vg1.setStroke(Color.BLACK);
		Line vg1l1 = new Line(392.25, 727.25, 392.25, 658); vg1l1.setStrokeWidth(0.5);
		Line vg1l2 = new Line(400.38, 727.25, 400.38, 654); vg1l2.setStrokeWidth(0.5);
		Line vg1l3 = new Line(408.25, 727.25, 408.25, 654); vg1l3.setStrokeWidth(0.5);
		Line vg1l4 = new Line(416.25, 727.25, 416.25, 658); vg1l4.setStrokeWidth(0.5);
		//V medio
		SVGPath vg2 = new SVGPath();
		vg2.setContent("M473.588,568.734v55.557h41.41v-55.557c0,0,2.006-18.734-20.705-18.734\r\n" + 
				"	C472.463,550,473.588,568.734,473.588,568.734z");
		vg2.setFill(Color.web("D05E79"));
		vg2.setStroke(Color.BLACK);
		Line vg2l1 = new Line(481.25, 623.501, 481.25, 554); vg2l1.setStrokeWidth(0.5);		
		Line vg2l2 = new Line(489.5, 622.667, 489.5, 550); vg2l2.setStrokeWidth(0.5);
		Line vg2l3 = new Line(497.333, 623.501, 497.333, 550); vg2l3.setStrokeWidth(0.5);
		Line vg2l4 = new Line(506, 623.084, 506, 551.918); vg2l4.setStrokeWidth(0.5);
		//V der
		SVGPath vg3 = new SVGPath();
		vg3.setContent("M563.088,458.234v55.557h41.41v-55.557c0,0,2.006-18.734-20.705-18.734\r\n" + 
				"	C561.963,439.5,563.088,458.234,563.088,458.234z");
		vg3.setFill(Color.web("D05E79"));
		vg3.setStroke(Color.BLACK);
		Line vg3l1 = new Line(571,513,571,445); vg3l1.setStrokeWidth(0.5);		
		Line vg3l2 = new Line(579,513,579,441); vg3l2.setStrokeWidth(0.5);
		Line vg3l3 = new Line(587.5,513,587.5,441); vg3l3.setStrokeWidth(0.5);
		Line vg3l4 = new Line(595.25,513,595.25,444.25); vg3l4.setStrokeWidth(0.5);
		
		//Puerta base
		SVGPath pb = new SVGPath();
		pb.setContent("M440.796,741.321V895h120.188V741.321c0,0,5.822-51.821-60.094-51.821\r\n" + 
				"	C437.531,689.5,440.796,741.321,440.796,741.321z");
		pb.setFill(Color.web("D05E79"));
		pb.setStroke(Color.BLACK);
		
		//Puerta marco
		SVGPath pm = new SVGPath();
		pm.setContent("M449.997,747.305V895h100.5V747.305c0,0,4.868-49.805-50.251-49.805\r\n" + 
				"	C447.267,697.5,449.997,747.305,449.997,747.305z");
		pm.setFill(Color.web("D05E79"));
		pm.setStroke(Color.BLACK);
		
		//Lineas
		Line pl1 = new Line(464.625,711,464.625,895); pl1.setStrokeWidth(0.5);		
		Line pl2 = new Line(488.333,697,488.333,895); pl2.setStrokeWidth(0.5);
		Line pl3 = new Line(512.375,697,512.375,895); pl3.setStrokeWidth(0.5);
		Line pl4 = new Line(536,709,536,895); pl4.setStrokeWidth(0.5);
		
		//Flor 1
		SVGPath f1= new SVGPath();
		f1.setContent("M447.5,874.875c0,0,9.375-12,16.75-2.5c4.5,6.125,2.125,15.625-8.375,17.25c0,0,19.459,1.875,10.542,15.375\r\n" + 
				"	c-4.542,3.625-7.917,7.5-18.917-1.875c5.25,9.875,5.875,17.75-6.375,20.125c-10.625,1.25-11.375-11.375-10.5-16.375\r\n" + 
				"	c-9.25,13.25-19.75,3.75-19.75,3.75s-11.25-15.625,8-19.75c0,0-14.75-4.125-8.75-17.375c11.125-11.625,20.25,3.625,20.25,3.625\r\n" + 
				"	s-5.125-16.75,8.875-18.875C453.5,859,447.5,874.875,447.5,874.875z");
		f1.setFill(Color.web("C3AC3E"));
		f1.setStroke(Color.BLACK);		
		//Flor 1 centro
		Circle f1c = new Circle(438,890.88,11,Color.web("FFCC66"));
		f1c.setStroke(Color.BLACK);
		
		//Flor 2
		SVGPath f2 = new SVGPath();
		f2.setContent("M341.953,843.261c0,0,20.048-7.094,22.714,15.239c-0.833,7.5-1.333,12.667-17.333,17.667\r\n" + 
				"	c5.833,3.666,13.667,14.666,5,26.666c-4.167,4.5-14.834,9.501-27.167-3.999c0,0-1.666,17.999-19.333,15.499s-16.167-20-10.333-25.5\r\n" + 
				"	c-7,2.167-22.5,4.667-24.167-13.666c-1.426-15.69,12.333-19.333,17.667-17.5c-6.167-6.834-9.5-14.667-2.333-24.167\r\n" + 
				"	c0,0,10.833-12.333,24.5,1.333c1.667-5.5,8.167-14.5,19.5-12.221C338.833,824.446,343.667,828.667,341.953,843.261z");
		f2.setFill(Color.web("C3AC3E"));
		f2.setStroke(Color.BLACK);
		//Flor 2 centro
		Circle f2c = new Circle(318,869.33,15,Color.web("FFCC66"));
		f2c.setStroke(Color.BLACK);	
		
		//Flor 3
		SVGPath f3 = new SVGPath();
		f3.setContent("M224.5,865.5c0,0,27.667,0.999,20.167,25.833c-4.167,5.5-15.167,18.333-36-3c1.667,3.667,17,30-9.667,36.667\r\n" + 
				"	c-4.833-0.333-26.167-1.167-18.5-30.5c-4.167,6-21.833,24.666-37.333,6.333c0,0-17.167-24.833,20.667-33.833\r\n" + 
				"	c-14.333-3.5-29.833-9.834-20.667-29.167c3.667-4.666,16.166-19.166,38.833,8.834C179.333,837.5,170.333,813,196.333,810\r\n" + 
				"	c6,0.5,23.5,4.501,15.333,28.667c5.833-6.167,19.166-15.5,29.833-0.5C243.833,843.667,250.167,859.667,224.5,865.5z");
		f3.setFill(Color.web("C3AC3E"));
		f3.setStroke(Color.BLACK);
		//Flor 3 centro
		Circle f3c = new Circle(191.13, 868.5,19,Color.web("FFCC66"));
		f3c.setStroke(Color.BLACK);
		
		//Flor 4
		SVGPath f4 = new SVGPath();
		f4.setContent("M110.667,851.5c0,0,5.74-6.563,9.667-1c1,1.833,4.023,7.125-4.415,9.333c0,0,9.956,2.792,5.503,9.334\r\n" + 
				"	c-1.641,2.177-4.735,5.021-10.756,0c0,0,5.24,10.083-4.104,10.583c-3.344,0-8.813-1.875-6-9.438\r\n" + 
				"	c-2.125,2.875-5.813,4.703-10.021,2.458c-2.229-1.396-5.042-8.354,4.021-12.208c-3.438-0.25-8.5-4.25-5.813-9.688\r\n" + 
				"	c2.125-3.813,8.063-4.438,12,2.25c0,0-2.958-11.083,5.313-11.188C108.188,841.938,113.25,843.583,110.667,851.5z");
		f4.setFill(Color.web("C3AC3E"));
		f4.setStroke(Color.BLACK);
		//Flor 4 centro
		Circle f4c = new Circle(104.88,860.88,6.5,Color.web("FFCC66"));
		f4c.setStroke(Color.BLACK);
		
		//Flor 5 
		SVGPath f5 = new SVGPath();
		f5.setContent("M271.5,933.25c0,0,9-10.25,16.375-1.375c1.75,3,5.625,11.75-8.188,16.5\r\n" + 
				"	c5.313,0.875,15.5,3.313,10.049,15.125c-1.487,2.375-5.112,9.125-18.237-1.375c1,4.125,8.125,18.125-6.875,20.25\r\n" + 
				"	c-3.5,0.25-14.5-1.375-10.5-17.125c-3.5,3.5-10.875,13.625-20.125,3.5c-2.375-2.625-7.833-15.083,10.75-19.375\r\n" + 
				"	c-5.75-1.125-17.531-4.063-11.125-16.875c1.813-2.938,10.125-11,21.125,4.25c-1.75-4.5-4.5-17.75,7.375-19.75\r\n" + 
				"	C265,917,275.5,916.875,271.5,933.25z");
		f5.setFill(Color.web("C3AC3E"));
		f5.setStroke(Color.BLACK);
		//FLor 5 centro
		Circle f5c = new Circle(261.42, 949.58,11.5,Color.web("FFCC66"));
		f5c.setStroke(Color.BLACK);
		
		//Flor 6
		SVGPath f6 = new SVGPath();
		f6.setContent("M583.333,832.5c0,0,18-20,30.667-3.667c2.167,3.833,11.333,23-19.667,29.333\r\n" + 
				"	c4.334,0,33.334,2.917,22.834,29.667c-3.334,6.333-17.834,14.667-33.834-2.833c1.834,12.166,6.667,32.333-17.333,33.666\r\n" + 
				"	c-13.5,0-26.999-10.333-14.833-36.333c-7,6.333-18.501,18.499-33.334,3.333c-6.333-7.333-8.499-27,24.334-29.333\r\n" + 
				"	c-8.667-4.167-32.666-13-18.5-32.5c6-6.833,16.167-14.334,31.5,5.333c-1.834-9-3.668-24.332,14.666-25.666\r\n" + 
				"	C577.833,803.5,592.499,806.667,583.333,832.5z");
		f6.setFill(Color.web("C3AC3E"));
		f6.setStroke(Color.BLACK);
		//Flor 6 medio
		SVGPath f6m = new SVGPath();
		f6m.setContent("M576.271,849.208c0,0,9.059-8.342,14.133-0.357c0.822,1.84,4.178,10.966-10.219,12.522\r\n" + 
				"	c1.974,0.187,15.063,2.759,9.134,14.499c-1.789,2.742-8.755,5.918-15.296-2.74c0.316,5.62,1.654,15.018-9.341,14.597\r\n" + 
				"	c-6.15-0.578-11.857-5.865-5.202-17.189c-3.46,2.584-9.223,7.637-15.331,0.092c-2.571-3.613-2.717-12.669,12.344-12.324\r\n" + 
				"	c-3.771-2.271-14.328-7.324-7.038-15.603c3.026-2.855,7.98-5.838,14.125,3.778c-0.449-4.178-0.63-11.243,7.782-11.066\r\n" + 
				"	C575.008,835.759,581.555,837.83,576.271,849.208z");
		f6m.setFill(Color.web("C3AC3E"));
		f6m.setStroke(Color.BLACK);
		//Flor 6 centro
		Circle f6c = new Circle(568.688,860.563,9.188);		
		f6c.setFill(Color.web("FFCC66"));
		f6c.setStroke(Color.BLACK);
		
		//Flor 7
		SVGPath f7 = new SVGPath();
		f7.setContent("M728.289,880.083c0,0,10.437-12.34,18.293-2.723c1.359,2.271,6.918,12.64-9.582,16.39\r\n" + 
				"	c2.593-0.072,17.833,1.099,12,17.375c-1.887,3.865-10.255,9.512-20.125-0.75c1.305,7.29,5.5,17.375-8.563,19.625\r\n" + 
				"	c-8.078,0.227-16.275-5.151-9.438-21c-4.081,3.926-11.752,13.059-20.882,4.18c-3.913-4.306-5.543-16.105,14.065-18.062\r\n" + 
				"	c-5.257-2.36-19.77-7.276-11.62-19.247c3.475-4.213,9.433-8.896,18.938,2.679c-1.246-5.384-2.606-14.578,8.344-15.692\r\n" + 
				"	C724.507,862.724,733.338,864.384,728.289,880.083");
		f7.setFill(Color.web("C3AC3E"));
		f7.setStroke(Color.BLACK);
		//FLor 7 centro
		Circle f7c = new Circle(720.313, 896.543,10.063,Color.web("FFCC66"));
		f7c.setStroke(Color.BLACK);
		
		//Flor 8
		SVGPath f8 = new SVGPath();
		f8.setContent("M782.295,790.775c0,0,11.195-9.118,18.005,4.55c1.183,4.984,2.043,8.402-7.042,15.255\r\n" + 
				"	c4.566,1.012,12.089,6.252,9.292,15.906c-1.636,3.828-7.312,9.464-18.282,3.653c0,0,3.05,11.886-8.817,14.328\r\n" + 
				"	c-11.865,2.439-14.906-9.091-12.434-13.94c-3.979,2.985-13.318,8.127-18.573-3.213c-4.499-9.704,3.464-15.179,7.293-15.227\r\n" + 
				"	c-5.504-2.959-9.426-7.205-7.016-14.915c0,0,4.106-10.361,15.968-4.748c-0.191-3.898,1.907-11.138,9.672-12.271\r\n" + 
				"	C776.001,779.46,780.056,781.054,782.295,790.775z");
		f8.setFill(Color.web("C3AC3E"));
		f8.setStroke(Color.BLACK);
		//FLor 8 centro
		Circle f8c = new Circle(773.104, 812.751,11.188,Color.web("FFCC66"));
		f8c.setStroke(Color.BLACK);
		
		//Flor 9
		SVGPath f9 = new SVGPath();
		f9.setContent("M864.874,889.02c0,0,27.429,3.752,17.492,27.715c-4.694,5.058-16.918,16.73-35.521-6.573\r\n" + 
				"	c1.293,3.815,13.924,31.545-13.273,35.521c-4.775-0.813-25.92-3.769-15.368-32.191c-4.743,5.554-24.182,22.367-37.778,2.58\r\n" + 
				"	c0,0-14.607-26.419,23.936-31.604c-13.914-4.911-28.705-12.759-17.658-31.08c4.114-4.278,17.995-17.461,37.76,12.659\r\n" + 
				"	c-1.739-9.388-8.254-34.661,17.916-35.058c5.921,1.097,22.936,6.822,12.4,30.053c6.419-5.555,20.615-13.512,29.734,2.476\r\n" + 
				"	C886.286,869.222,890.993,885.773,864.874,889.02z");
		f9.setFill(Color.web("C3AC3E"));
		f9.setStroke(Color.BLACK);
		//Flor 9 medio
		SVGPath f9m = new SVGPath();
		f9m.setContent("M843.646,878.699c0,0,9.741-8.19,14.561,0.317c0.754,1.943,3.691,10.729-9.614,11.448\r\n" + 
				"	c2.022,0.289,13.696,3.222,7.005,15.081c-1.977,2.749-9.222,6.02-15.52-3.256c0.043,5.831,1.96,14.216-9.253,14.094\r\n" + 
				"	c-6.3-0.896-11.949-6.16-4.535-17.552c-3.689,2.505-10.858,8.573-16.765,0.469c-2.464-3.861-2.162-13.236,13.318-12.149\r\n" + 
				"	c-3.767-2.53-14.377-8.274-6.462-16.482c3.255-2.809,8.502-5.652,14.344,4.595c-0.253-4.345-0.089-11.661,8.56-11.072\r\n" + 
				"	C843.018,864.725,849.652,867.186,843.646,878.699z");
		f9m.setFill(Color.web("C3AC3E"));
		f9m.setStroke(Color.BLACK);
		//Flor 9 centro
		Circle f9c = new Circle(835.479,888.896,9.063);		
		f9c.setFill(Color.web("FFCC66"));
		f9c.setStroke(Color.BLACK);
		
		//Flor 10
		SVGPath f10 = new SVGPath();
		f10.setContent("M953.332,846.834c0,0,5.74-6.563,9.668-1c1,1.833,4.022,7.125-4.415,9.333c0,0,9.956,2.792,5.503,9.334\r\n" + 
				"	c-1.641,2.177-4.734,5.021-10.756,0c0,0,5.24,10.083-4.104,10.583c-3.344,0-8.813-1.875-6-9.438\r\n" + 
				"	c-2.125,2.875-5.813,4.703-10.021,2.458c-2.229-1.396-5.042-8.354,4.021-12.208c-3.438-0.25-8.5-4.25-5.813-9.688\r\n" + 
				"	c2.125-3.813,8.063-4.438,12,2.25c0,0-2.958-11.083,5.313-11.188C950.854,837.271,955.916,838.917,953.332,846.834z");
		f10.setFill(Color.web("C3AC3E"));
		f10.setStroke(Color.BLACK);
		//FLor 10 centro
		Circle f10c = new Circle(949.021, 856.972,7.138,Color.web("FFCC66"));
		f10c.setStroke(Color.BLACK);
				
				
		root.getChildren().addAll(n1,n2,n2l,n4,n5,n6,n7,n7l1,n7l2,n8,n9,n10,n10l,n11,n12,n13,n14,
				arbst,piso,cami,
				aim,aimc1,aimc2,aimc3,aimc4,aimr,aii,aiic1,aiic2,aiic3,aiir,aid,aidc1,aidc2,aidr,
				add,addc1,addc2,addc3,addc4,addc5,addr,adi,adic1,adic2,adic3,adic4,adic5,adir,adm,admc1,admc2,admc3,admc4,admc5,admc6,admr,
				sl1,sl2,sl3,sl4,sl5,sl6,sl7,sl8,sl9,sb,soi,soip,sod,sodp,smi,smd,ss1,ss2,ss3,n3,n3l1,n3l2,
				band,cpta,cptal1,cptal2,cptal3,cptal4,cptal5,cpa,cb,csp,tis,tit,titl1,titl2,titl3,tds,tdt,tdtl1,tdtl2,tdtl3,cptm,cptml1,cptml2,cptml3,cptml4,cpf,
				vp1,vp2,vp3,vp4,vp5,vp6,vp7,vp8,vp9,
				vg1,vg1l1,vg1l2,vg1l3,vg1l4,vg2,vg2l1,vg2l2,vg2l3,vg2l4,vg3,vg3l1,vg3l2,vg3l3,vg3l4,
				pb,pm,pl1,pl2,pl3,pl4,
				f1,f1c,f2,f2c,f3,f3c,f4,f4c,f5,f5c,f6,f6m,f6c,f7,f7c,f8,f8c,f9,f9m,f9c,f10,f10c,nombre);
		Scene scene = new Scene(root,1000,1000);
		return scene;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch();
	}

}
