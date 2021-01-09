import axios from "axios";

const API_URL = 'https://ygort-dsdelivery.herokuapp.com';

export function fetchProducts() {
    return axios.get(`${API_URL}/products`);
}