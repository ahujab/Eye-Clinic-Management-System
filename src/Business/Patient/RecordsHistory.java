/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Patient;

import java.util.ArrayList;


public class RecordsHistory {
      private ArrayList<Records> recordList;
      
      public RecordsHistory(){
          this.recordList = new ArrayList<>();
      }
      
      public ArrayList<Records> getRecordList(){
          return recordList;
      }
      
      public void setRecodList(ArrayList<Records> recordList){
          this.recordList = recordList;
      }
      
      public Records addRecord(){
          Records records = new Records();
          recordList.add(records);
          return records;
      }
      public void removeRecord(Records records){
          recordList.remove(records);
      }
}
