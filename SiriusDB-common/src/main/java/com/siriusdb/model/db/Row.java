package com.siriusdb.model.db;
//import com.siriusdb.model.db.Attribute;
import com.siriusdb.enums.DataTypeEnum;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Row {

    private List<Element> elements;

    public void addElement(Element element){
        this.elements.add(element);
    }; // 添加一个属性值

    public Element getElements(int index){
        return elements.get(index);
    }; // 得到对应下标的属性值

/*    Row row = new Row();
    Element<String> element = new Element<String>();
        element.setType(DataTypeEnum.STRING.getType());
        element.setData("123");
        element.setColumnId(1);

    Element<Integer> element1 = new Element<Integer>();
        element1.setColumnId(2);
        element1.setType(DataTypeEnum.INTEGER.getType());
        element1.setData(211);

    List<Element> elementList = new ArrayList<>();
        elementList.add(element);
        elementList.add(element1);
        row.setElements(elementList);*/

}
