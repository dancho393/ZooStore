package com.example.zoostore.api.operations.base;

public interface Operation  <O extends OperationResponse,I extends OperationRequest>{
    public O process (I input) ;



}
