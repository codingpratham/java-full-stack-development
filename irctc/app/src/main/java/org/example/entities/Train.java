package org.example.entities;

import java.util.List;
import java.util.Map;
import java.sql.Time;

public class Train {
    private String trainId;
    private String trainNo;
    private List<List<Integer>> seats;
    private Map<String , Time> stationTime;
}
