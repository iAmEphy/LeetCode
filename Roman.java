class Roman{
    
    public int romanToInt(String s) {
        
        //put result here
		int result = 0;
		
		//map, String roman, int number
		HashMap<String, Integer> map = new HashMap<String, Integer>();
        
		map.put("I", 1);
		map.put("V", 5);
		map.put("X", 10);
		map.put("L", 50);
		map.put("C", 100);
		map.put("D", 500);
		map.put("M", 1000);
		
        	//loop
		for (int i = 0; i < s.length(); i++) {
			if (i > 0 && map.get(String.valueOf(s.charAt(i - 1))) < map.get(String.valueOf(s.charAt(i)))){
                
				result += map.get(String.valueOf(s.charAt(i))) - 2 * map.get(String.valueOf(s.charAt(i - 1)));
                
			} 
            else{
                
				result += map.get(String.valueOf(s.charAt(i)));
                
			}
            
		}
        
		return result;
    }
    
}