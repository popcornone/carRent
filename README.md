# carRent


서비스 시나리오 


기능적 요구사항
1. 관리자는 대여가능한 차량을 등록한다. 
2. 관리자는 대여불가능한 차량을 폐기한다.
3. 사용자는 회원가입을 한다. 
4. 사용자는 차량을 예약한다.
5. 예약을 취소한다.
6. 차량대여를 위해서는 개인정보를 입력한다.(운전면허증)
7. 차량을 대여한다.
8. 차량을 반납한다. 

비기능적 요구사항
1. 결제가 되지 않으면 예약이 불가능하다.
2. 운전면허증을 등록하지 않으면 예약이 불가능하다. 

장애격리
1. 차량관리 시스템이 동작하지 않더라도 차량 예약이 가능하다.
2. 

성능
1. 사용자는 전체 차량 대여 가능 목록을 실시간으로 확인할 수 있어야 한다.



체크포인트
1. Saga (Pub / Sub)
2. CQRS
3. Compensation / Correlation
4. Request / Response
7. Circuit Breaker
5. Gateway / Ingress
6. Deploy / Pipeline
8. Autoscale (HPA)
9. Zero-downtime deploy (Readiness probe)
10. Persistence Volume/ConfigMap/Secret
11. Polyglot
12. Self-healing (liveness probe)
