package Repository;

import Domain.Items.ItemHeroi;
import Tools.CSVItemReader;

import java.io.FileNotFoundException;
import java.util.ArrayList;

    public class ItemRepository {
        private ArrayList<ItemHeroi> itemHerois;


        public ItemRepository(String filePath) throws FileNotFoundException {
            CSVItemReader csvItemReader = new CSVItemReader(filePath);
            this.itemHerois=csvItemReader.readCSV();

    }

    public ArrayList<ItemHeroi> getItemHerois(){
        return itemHerois;
    }


}
