# Spring MVC & Request Lifecycle

```text
HTTP Client → Servlet Container → Filters → DispatcherServlet
→ HandlerMapping → Interceptor → Controller → Service → Repository
→ Return Value → HttpMessageConverter → HTTP Response
```

## Controller
```java
@RestController
@RequestMapping("/orders")
class OrderController {
    @GetMapping("/{id}")
    OrderResponse get(@PathVariable long id) { return service.get(id); }
}
```

## Inputs
`@PathVariable`, `@RequestParam`, `@RequestHeader`, `@RequestBody`, `@ModelAttribute`.

## Mappings
`@GetMapping`, `@PostMapping`, `@PutMapping`, `@PatchMapping`, `@DeleteMapping`.

## Trap
`DispatcherServlet` is Spring MVC's front controller; Tomcat/Jetty is the servlet container/runtime.
