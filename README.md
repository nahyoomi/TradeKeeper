# User Manual - TradeKeeper API

Welcome to the User Manual for the TradeKeeper API. This manual will provide you with detailed instructions on how to use the various endpoints and functionalities provided by the TradeKeeper API.

## Table of Contents
- [Introduction](#introduction)
- [API Endpoints](#api-endpoints)
  - [Get All Items](#get-all-items)
  - [Get Item Details](#get-item-details)
  - [Create Item](#create-item)
  - [Update Item](#update-item)
  - [Deactivate Item](#deactivate-item)
  - [Update Price Reduction](#update-price-reduction)
  - [Update Supplier](#update-supplier)
  - [Get Price Reductions](#get-price-reductions)
  - [Create Price Reduction](#create-price-reduction)
  - [Get Suppliers](#get-suppliers)
  - [Create Supplier](#create-supplier)
- [Conclusion](#conclusion)

## Introduction

The TradeKeeper API allows users to manage and keep track of their items for buying and selling. It provides various endpoints to perform operations such as retrieving items, creating new items, updating item details, managing suppliers, and handling price reductions.

To access the API, you will need the base URL provided by the TradeKeeper system administrator. Make sure you have the necessary authorization credentials to authenticate your requests.

## API Endpoints

### Get All Items

- **Endpoint**: `/api/item/items/{state}`
- **Method**: GET
- **Description**: Retrieves a list of all items based on the specified state.
- **Parameters**:
  - `state` (Path Variable): The state of the items to retrieve. Valid values are "Active" or "Deactive".
- **Response**: Returns a list of items with the specified state.

### Get Item Details

- **Endpoint**: `/api/item/{itemCode}`
- **Method**: GET
- **Description**: Retrieves the details of a specific item.
- **Parameters**:
  - `itemCode` (Path Variable): The unique code of the item to retrieve.
- **Response**: Returns the details of the specified item.

### Create Item

- **Endpoint**: `/api/item`
- **Method**: POST
- **Description**: Creates a new item.
- **Request Body**: Provide the necessary information for the item in the request body.
- **Response**: Returns the created item with its assigned ID.

### Update Item

- **Endpoint**: `/api/item/update`
- **Method**: PUT
- **Description**: Updates the details of an existing item.
- **Request Body**: Provide the updated information for the item in the request body.
- **Response**: Returns the updated item.

### Deactivate Item

- **Endpoint**: `/api/item/remove/{idItem}/{reason}`
- **Method**: DELETE
- **Description**: Deactivates an item by changing its state to "Deactive".
- **Parameters**:
  - `idItem` (Path Variable): The ID of the item to deactivate.
  - `reason` (Path Variable): The reason for deactivating the item.
- **Response**: Returns the deactivated item.

### Update Price Reduction

- **Endpoint**: `/api/item/priceReduction`
- **Method**: PUT
- **Description**: Updates the price reduction details of an existing item.
- **Request Body**: Provide the updated price reduction information for the item in the request body.
- **Response**: Returns the updated item.

### Update Supplier

- **Endpoint**: `/api/item/supplier`
- **Method**: PUT
- **Description**: Updates the supplier details of an existing item.
- **Request Body**: Provide the updated supplier information for the item in the request body.
- **Response**: Returns the updated item with the updated supplier details.

### Get Price Reductions

- **Endpoint**: `/api/priceReduction/priceReductions`
- **Method**: GET
- **Description**: Retrieves a list of all price reductions.
- **Response**: Returns a list of all price reductions.

### Create Price Reduction

- **Endpoint**: `/api/priceReduction`
- **Method**: POST
- **Description**: Creates a new price reduction.
- **Request Body**: Provide the necessary information for the price reduction in the request body.
- **Response**: Returns the created price reduction with its assigned ID.

### Get Suppliers

- **Endpoint**: `/api/supplier/suppliers`
- **Method**: GET
- **Description**: Retrieves a list of all suppliers.
- **Response**: Returns a list of all suppliers.

### Create Supplier

- **Endpoint**: `/api/supplier`
- **Method**: POST
- **Description**: Creates a new supplier.
- **Request Body**: Provide the necessary information for the supplier in the request body.
- **Response**: Returns the created supplier with its assigned ID.

## Conclusion

Congratulations! You have successfully learned how to use the TradeKeeper API and its various endpoints. You can now perform operations such as retrieving items, creating new items, updating item details, managing suppliers, and handling price reductions.

If you have any further questions or require assistance, please reach out to the TradeKeeper support or your system administrator.

Happy trading with TradeKeeper API!
