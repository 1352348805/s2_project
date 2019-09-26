package ChangePage;

import java.util.ArrayList;
import java.util.List;

public class Page<T> {
    private int pageSum; //总页数
    private int pageAt; //当前页数
    private int allRecordCount; //总记录数
    private int showRecordCount; //单页显示的记录数

    List<T> list = new ArrayList<T>();//商品列表


    /**
     * 调节总页数 初始载入时、用户调整单页显示的数量时发生
     */
    private void adjustmentPage(){
        int page = allRecordCount/showRecordCount;
        if (allRecordCount%showRecordCount > 0){
            page++;
        }
        this.pageSum = page;
    }


    public int getPageSum() {
        return pageSum;
    }

    public int getPageAt() {
        return pageAt;
    }

    public void setPageAt(int pageAt) {
        this.pageAt = pageAt;
    }

    public int getAllRecordCount() {
        return allRecordCount;
    }

    public void setAllRecordCount(int allRecordCount) {
        this.allRecordCount = allRecordCount;
        adjustmentPage();
    }

    public int getShowRecordCount() {
        return showRecordCount;
    }

    public void setShowRecordCount(int showRecordCount) {
        this.showRecordCount = showRecordCount;
        adjustmentPage();
    }
}

class Phone{

}
class Food{

}
