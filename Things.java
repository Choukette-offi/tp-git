class Thing{
    String name;
    public Thing(String name){
        this.name = name;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (!(obj instanceof Thing))
            {return false;}
        Thing other = (Thing) obj;
        if (name == null) {
            if (other.name != null)
                {return false;}
        } else if (!name.equals(other.name))
            {return false;}
        return true;
    }
    
}
