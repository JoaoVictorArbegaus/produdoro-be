//package dev.wakanda.produdoro.handler;
//
//import lombok.extern.log4j.Log4j2;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.ExceptionHandler;
//import org.springframework.web.bind.annotation.RestControllerAdvice;
//
//@RestControllerAdvice
//@Log4j2
//public class RestResponseEntityExceptionHandler {
//
//    @ExceptionHandler(APIException.class) //indica ao spring que toda exceção "APIException" caia nesse metodo
//    public ResponseEntity<ErrorApiResponse> handlerGenericException(APIException ex){
//        return ex.buildErrorResponseEntity();
//    }
//
//    @ExceptionHandler(Exception.class) //indica ao spring que toda exceção "Exception" caia nesse metodo
//    public ResponseEntity<ErrorApiResponse> handlerGenericException(Exception ex){
//        log.error("Exeception ",ex);
//        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
//                .body(ErrorApiResponse.builder()
//                        .description("INTERNAL SERVER ERROR!")
//                        .message("Por favor informe o ADM do sistema!")
//                        .build());
//
//    }
//}