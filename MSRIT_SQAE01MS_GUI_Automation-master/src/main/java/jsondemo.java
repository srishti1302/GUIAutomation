import java.io.FileReader;
import java.util.Iterator;
import java.util.Map;
import org.json.*;
import java.lang.*;
//import org.json.JSONArray;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.*;
import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Collectors;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Srishti
 */
public class jsondemo {
    



	public static List<String> compareWith(String n) throws Exception
	{
		// parsing file "JSONExample.json"
List<String> result=new ArrayList<>();

		Object obj = new JSONParser().parse(new FileReader(".\\file\\screen1.json"));
		
		// typecasting obj to JSONObject
		JSONObject jo = (JSONObject) obj;

		Object layers1=jo.get("layers");

//String demo1=layers1.toString();
//demo1.trim();
JSONArray jo2=new JSONArray ();





jo2=(JSONArray)layers1;
JSONArray l=(JSONArray) jo.get("layers");
JSONObject obj3=new JSONObject();
//System.out.println("\njsonarray l \n"+l.toString().trim()+"\n\n");
Iterator<JSONObject> iterator = jo2.iterator();
			while (iterator.hasNext()) {
				//System.out.println(iterator.next());
 obj3=iterator.next();
			}

Object object=obj3.get("layers");
//System.out.println("\n object \n"+object.toString().trim()+"\n\n");

JSONArray l2=(JSONArray) object;

//System.out.println("\nlayers2\n"+l2.toString().trim()+"\n\n");
int i=0;
Iterator<JSONObject> it = l2.iterator();
//System.out.println("iterator created");
JSONObject  gname=new JSONObject();
for( i=0;i<l2.size();i++){
Object o1=it.next();
gname=(JSONObject)o1;
Object name=gname.get("name");
//System.out.println("element:"+i+" name:"+name.toString().trim()+"\n");
if(name.toString().equals(n))break;
}
Object frameobj=gname.get("frame");
JSONObject fobj=(JSONObject)frameobj;


result.add(gname.get("name").toString());
result.add("isVisible:"+gname.get("isVisible"));
result.add(fobj.get("x").toString());
result.add(fobj.get("y").toString());
result.add(fobj.get("height").toString());
result.add(fobj.get("width").toString());

return result;
}
}