# Flower Store

[![Java CI](https://github.com/andylvua/FlowerStore/actions/workflows/ci.yaml/badge.svg)](https://github.com/andylvua/FlowerStore/actions/workflows/ci.yaml)

## Description

Simple flower store application for Labs 5-8 assignment of OOP course.

## Lab 5 Task

- [x] Implement a class Flower or system of classes that implement the essence of Rose, Chamomile, and Tulip in a flower store. The class or classes should have attributes sepalLength, color, and price.
- [x] Submit a project to GitHub.
- [x] Add SuperLinter to the project and fix all issues.
- [x] Propose an approach to represent flower color (explore the proposed tests).
- [x] Add all next changes in a separate branch flower-bucket and merge them into the main branch with Pull Request.
- [x] Implement FlowerPack class with attributes flower and amount. Implement method getPrice in it.
- [x] Implement FlowerBucket class that will aggregate several FlowerPack. Implement method price in it.
- [x] Implement class Store and method search in it.
- [x] Add tests to the project.
- [x] Setup GitHub Actions for this project that would run your tests.
- [x] Send a link to your GitHub here.

## Lab 7 Task

- [x] Initialize simple web
- [x] Add `@RestController` to a `DemoApplication.java` and implement methods with `@GetMapping` to return a list of objects.
- [x] Migrate `Flower` to this project and implement an endpoint that will return `List.of(Flower)`.
- [x] Refactor `FlowerController`: move to separate package and add `@RequestMapping`.
- [x] Implement `Order` that will implement client order.
- [x] Implement `Item` that will represent the basic element of `Order`.
- [x] Implement different payment strategies with an interface `Payment` and several implementations of it `CreditCardPaymentStrategy`, `PayPalPaymentStrategy`. Use Strategy pattern.
- [x] Implement several `Delivery` strategies: `PostDeliveryStrategy`, `DHLDeliveryStrategy`.
- [x] Cover delivery and payment packages with tests and endpoints for them.
- [x] Set up GitHub Actions for this project that would run your tests.
- [x] Send a link to your GitHub here.

### Results of Lab 7

#### api/flowerstore

Here we can see welcoming message with simple usage instructions.

<img width="1440" alt="image" src="https://user-images.githubusercontent.com/93153950/201205024-30aa7b64-a126-47ce-a11f-8a327a5cc4a3.png">

#### api/flowerstore/help

This endpoint returns a list of all available endpoints.

<img width="1440" alt="image" src="https://user-images.githubusercontent.com/93153950/201205115-4295dac2-5585-437a-ab54-f8be296ced30.png">

#### api/flowerstore/all

We can go to the endpoint `api/flowerstore/all` to see all flowers in the store. Flower store is being automatically initialized with random flower objects.

<img width="1440" alt="image" src="https://user-images.githubusercontent.com/93153950/201205228-b93995f4-0f38-4cad-9556-a064deae3d3e.png">


### Lab 8 Task

- [x] Refactor business logic of `getFlowers` to `FlowerService`
- [x] Use `@Autowired` and `@Servic`e for Dependency Injection.
- [x] Setup DB with Docker `docker run --name oop-course -e POSTGRES_PASSWORD=postgres -d -p 5432:5432 postgres`
- [x] Add flowers DB via Database viewer (Intellj IDEA Ultimate or DBViewer)
- [x] Add JPA config. See application.properties attached.
- [x] Add `FlowerRepository` interface and inject it instance in `FlowerService`. Inject several record in DB. Check whether the endpoint will return all the records from DB.
- [x] Add `addFlower` method to API and Service layers. Implement `@PostMapping` with `@RequestBody` extraction.
- [x] Test GET and POST with test.http.
- [x] Implement `AbstractDecorator` that will implement basic decorator behavior.
- [x] Implement decorators based on attached diagram. This implementation should follow `Decorator Pattern`.
- [x] Cover decorators with tests.
- [x] Set up GitHub Actions for this project that would run your tests.
- [x] Send a link to your GitHub here.

### Results of Lab 8

#### GET request
We can add a several flower instances to the database using IntelliJ IDEA Database Viewer.

<img width="826" alt="image" src="https://user-images.githubusercontent.com/93153950/201207104-d1047913-0576-45c2-a36c-29d97b44099d.png">

Now, let's send a GET request to the endpoint `api/flowerstore/database/view` to see all flowers in the store's database.

<img width="827" alt="image" src="https://user-images.githubusercontent.com/93153950/201207119-212868dc-e35e-4664-ab6e-9ead1283a6c5.png">

We can see that all flower instances were successfully added to the database and returned by the endpoint.

<img width="1396" alt="image" src="https://user-images.githubusercontent.com/93153950/201207129-dd322a40-daa0-4503-9eed-15d426dc991e.png">

#### POST request
Now, let's send a several POST requests to the endpoint `api/flowerstore/database/add` to add a new flower instance to the store's database.

<img width="826" alt="image" src="https://user-images.githubusercontent.com/93153950/201209162-8eeb038f-aa49-4867-a0c0-1e9b15792844.png">

As we can see, the server responded with a status code 200 and the flower instances were successfully added to the database:

<img width="620" alt="image" src="https://user-images.githubusercontent.com/93153950/201209248-3b2094b7-7a16-462c-b320-70e854154dcb.png">
<img width="620" alt="image" src="https://user-images.githubusercontent.com/93153950/201209259-408456ad-a515-4172-a842-ed670ed5a6b5.png">
<img width="620" alt="image" src="https://user-images.githubusercontent.com/93153950/201209265-671fbd1c-ef61-48ba-84e2-b951dcf3a27d.png">

Now, sending a GET request to the endpoint `api/flowerstore/database/view` yields the following result:

<img width="1397" alt="image" src="https://user-images.githubusercontent.com/93153950/201209272-dd62795f-9136-48f6-a02c-660dc7935f0e.png">

## License

The [MIT](https://choosealicense.com/licenses/mit/) License (MIT)

Copyright © 2022. Andrii Yaroshevych