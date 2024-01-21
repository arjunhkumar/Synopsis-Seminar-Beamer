loadInlinedField(Field f){
    Object Oc = getContainerObject(f);
    if(f.isInlined()){
        Type T = f.type;
        Object Onew = new T();
        for(Field fi in Onew){
          Primitive pVal= Oc.f.fi;
          Onew.fi = pVal;
      }
      return Onew;
    }
} 