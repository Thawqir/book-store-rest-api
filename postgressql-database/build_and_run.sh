#!/bin/bash

docker build --platform linux/amd64 -t book-store-postgres .

docker run --platform linux/amd64 -p 5432:5432 -e POSTGRES_PASSWORD=root book-store-postgres
