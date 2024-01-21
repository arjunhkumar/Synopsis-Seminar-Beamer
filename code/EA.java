void foo(Container cx) {
    Container c = new Container();
    ...
    if(cond){
        y += bar(c.getF2()).x + i;
    }else {
        y += bar(cx.getF2()).x + i;
    }
    ...
}