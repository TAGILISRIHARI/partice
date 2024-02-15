package com.pack1;

import java.util.Collections;
import java.util.HashMap;
import java.util.PriorityQueue;

public class MapsPassingCollection 
{
	void passingCollectionsToHashMap()
	{
		HashMap<Object, Object> map = new HashMap<Object, Object>();
		PriorityQueue<Object> pq1 = new PriorityQueue<Object>();
		PriorityQueue<Object> pq2 = new PriorityQueue<Object>();
		Collections.addAll(pq1, 101,192,165,178,333);
		Collections.addAll(pq2, 456,322,123,567,890);
		
		Object ob1 = pq1.poll();
		Object ob2 = pq2.poll();
		map.put(ob1, ob2);
		
		

		
	}

}
