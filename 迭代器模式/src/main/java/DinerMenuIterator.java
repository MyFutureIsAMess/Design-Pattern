import java.util.Iterator;
/**
 * @author Guojian Wang
 * @date 2019/2/28 - 13:14
 * ━━━━━━神兽出没━━━━━━
 * 　　　┏┓　　　┏┓
 * 　　┏┛┻━━━┛┻┓
 * 　　┃　　　　　　　┃
 * 　　┃　　　━　　　┃
 * 　　┃　┳┛　┗┳　┃
 * 　　┃　　　　　　　┃
 * 　　┃　　　┻　　　┃
 * 　　┃　　　　　　　┃
 * 　　┗━┓　　　┏━┛
 * 　　　　┃　　　┃神兽保佑, 永无BUG!
 * 　　　　 ┃　　　┃Code is far away from bug with the animal protecting
 * 　　　　┃　　　┗━━━┓
 * 　　　　┃　　　　　　　┣┓
 * 　　　　┃　　　　　　　┏┛
 * 　　　　┗┓┓┏━┳┓┏┛
 * 　　　　　┃┫┫　┃┫┫
 * 　　　　　┗┻┛　┗┻┛
 * ━━━━━━感觉萌萌哒━━━━━━
 */
public class DinerMenuIterator implements Iterator {
    MenuItem[] items;
    int postion = 0;

    public DinerMenuIterator(MenuItem[] items) {
        this.items = items;
    }

    public Object next() {
        MenuItem menuItem = items[postion];
        postion = postion + 1;
        return menuItem;
    }

    public boolean hasNext() {
        if (postion >= items.length || items[postion] == null){
            return false;
        }else{
            return true;
        }
    }

    public void remove() {
        if (postion <= 0){
            throw new IllegalStateException("You can't remove an item util you've done at least one next()");
        }
        if (items[postion - 1] != null){
            for (int i = postion - 1; i < items.length - 1; i++){
                items[i] = items[i + 1];
            }
        }
        items[items.length - 1] = null;
    }
}
