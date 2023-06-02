package be.intris.tris.service.editool.xsd2edidefinition;


public class ComplexTypeInfo implements Comparable{
    String key;
    String name;
    String parentName;
    int level;
    long maxOccurs;
    long minOccurs;



    long occured;



    public ComplexTypeInfo(String name, String parentName, int level, long maxOccurs, long minOccurs) {
        this.name = name;
        this.parentName = parentName;
        this.level = level;
        this.maxOccurs = maxOccurs;
        this.minOccurs = minOccurs;
        this.occured = 1;
        this.key = String.format("%s/%s", parentName, name);
    }
    
    @Override
    public int hashCode() {
        int hash = 1;
        
        if (getKey() != null)
            hash = hash * getKey().hashCode();
        if (getName() != null)
            hash = hash * getName().hashCode();
        if (getParentName() != null)
            hash = hash * getParentName().hashCode();
        
        return hash;
    }

    public String getKey() {
        return key;
    }

    public String getName() {
        return name;
    }

    public String getParentName() {
        return parentName;
    }

    public int getLevel() {
        return level;
    }

    public long getMaxOccurs() {
        return maxOccurs;
    }

    public long getMinOccurs() {
        return minOccurs;
    }

    public void setMinOccurs(long minOccurs) {
        this.minOccurs = minOccurs;
    }

    public long getOccured() {
        return occured;
    }

    public boolean canOccur() {
        if (this.occured++ > this.maxOccurs)
            return false;
        else
            return true;
    }

    @Override
    public boolean equals(Object c2) {
        if (c2 instanceof ComplexTypeInfo) {
            ComplexTypeInfo complex2 = (ComplexTypeInfo) c2;
            if (this.name.equals(complex2.name)
                    && this.parentName.equals(complex2.parentName))
                return true;
        }
        return false;
    }

    @Override
    public int compareTo(Object c2) {
        if (c2 instanceof ComplexTypeInfo) {
            ComplexTypeInfo complex2 = (ComplexTypeInfo) c2;
            int result = this.key.compareTo(complex2.key);
            if (result == 0) {
                if (this.level > complex2.level) {
                    result = 1;
                } else if (this.level < complex2.level)
                    result = -1;
            }
            return result;
        }
        return -1;
    }

    @Override
    public String toString() {
        return "ComplexTypeInfo{" +
                "key='" + key + '\'' +
                ", name='" + name + '\'' +
                ", parentName='" + parentName + '\'' +
                ", level=" + level +
                ", maxOccurs=" + maxOccurs +
                ", occured=" + occured +
                '}';
    }

}
