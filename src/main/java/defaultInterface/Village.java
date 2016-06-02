/**
 * qizhi 学习
 * 2016-5-28 16:44:20
 *
 */
package defaultInterface;

/**
 *
 * @author qizhi
 */
public interface Village {

    void setNumOfPeople(int num);
    
    void setName(String name);
    
    default String getBusinessType(){
        return "Farming + villageId"+getVillageId();
    }
    
    static int getVillageId() {
        return 1;
    }
    
}
