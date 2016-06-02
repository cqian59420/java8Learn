/**
 * qizhi 学习
 * 2016-5-28 16:45:40
 *
 */
package defaultInterface;


public class VillageImpl implements Village {

    int noOfPeople;
    String name;
    
    @Override
    public void setNumOfPeople(int num) {
        noOfPeople = num;
    }

    @Override
    public void setName(String name) {
        this.name =name;
    }
    
    public int getVillageId(){
        return Village.getVillageId();
    }
    
}
