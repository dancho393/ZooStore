package com.example.zoostore.api.operations;

public interface Operation  <O extends OperationResponse,I extends OperationRequest>{
    public O process (I input) ;



}
