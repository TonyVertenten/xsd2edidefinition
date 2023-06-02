package be.intris.tris.service.editool.xsd2edidefinition;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;


public class ComplexTypeController {
    XmlSchema2EdiMessageDefinition xmlSchema2EdiMessageDefinition;
    Map<String, ComplexTypeInfo> complexTypeInfoMap = new LinkedHashMap<String, ComplexTypeInfo>();
    Map<Integer, String> parentMap = new HashMap<Integer, String>();
    ComplexTypeInfo lastComplexTypeInfo = null;

    public ComplexTypeController(XmlSchema2EdiMessageDefinition xmlSchema2EdiMessageDefinition) {
        this.xmlSchema2EdiMessageDefinition = xmlSchema2EdiMessageDefinition;
    }

    public ComplexTypeController() {

    }


    public boolean addComplexType(ComplexTypeInfo complexTypeInfo) {
        String searchKey = complexTypeInfo.getKey();
        ComplexTypeInfo complexTypeInfo1 = complexTypeInfoMap.get(searchKey);
        if (complexTypeInfo1 != null) {
            if (!complexTypeInfo1.canOccur())   // ??? is this necessary
                   return false;
        }
        complexTypeInfoMap.put(searchKey, complexTypeInfo);
        lastComplexTypeInfo = complexTypeInfo;
        return true;
    }

    public boolean addParent(Integer level, String name) {
        if (parentMap.containsValue(name)) {
            return false;
        }
        parentMap.put(xmlSchema2EdiMessageDefinition.getComplexLevel(), name);
        return true;
    }

    public boolean removeParent(Integer level, String name) {
        return parentMap.remove(level, name);
    }

    public String getParentName(Integer level) {
        return parentMap.get(level);
    }

    public String getLastParent(){
        return parentMap.get(parentMap.size()-1);
    }


    public boolean removeComplexType(ComplexTypeInfo complexTypeInfo) {
        String searchKey = complexTypeInfo.getKey();
        if (complexTypeInfoMap.remove(searchKey) != null)
            return true;
        return false;
    }

    public ComplexTypeInfo searchParent(ComplexTypeInfo complexTypeInfo) {
        // search first previous complex type with level - 1
        if (complexTypeInfoMap.containsValue(complexTypeInfo)) {
            // get the complextypeinfo
        }

        return null;

    }

    public ComplexTypeInfo getLastComplexTypeInfo() {
        ComplexTypeInfo lastComplexTypeInfo = null;
        Collection<ComplexTypeInfo> complexTypeInfos = complexTypeInfoMap.values();
        Iterator<ComplexTypeInfo> iterator = complexTypeInfos.iterator();
        while(iterator.hasNext()){
            lastComplexTypeInfo = iterator.next();
        }
        return lastComplexTypeInfo;
    }

    public void printComplexTypeInfoMap() {
        Collection<ComplexTypeInfo> complexTypeInfos = complexTypeInfoMap.values();
        for (ComplexTypeInfo info : complexTypeInfos) {
            xmlSchema2EdiMessageDefinition.getLogger().info("info = " + info);
        }
        xmlSchema2EdiMessageDefinition.getLogger().info("ComplexTypeInfoMap size: " + complexTypeInfos.size());
    }

}


