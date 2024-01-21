loadInlinedField(Field f){
  Object Oc = getContainerObject(f);
  if(f.signature[0]=='Q'){ //Field is inlined
    Type T = f.type;
    Object Onew = new T();
    for(Field fi in Onew){
      Primitive pVal= Oc.f.fi;
      Onew.fi = pVal;
    }
    return Onew;
  }
} 