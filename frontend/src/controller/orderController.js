import axios from "axios"
import { baseURL } from "./constants"

export class OrderController {
    static async getAll() {
        const respone = await axios.get(`${baseURL}/orders/getAll`)
        return respone.data
    }

    static async createOrder(orderDTO) {
        const respone = await axios.post(`${baseURL}/orders/createOrder`, orderDTO)
        return respone.data
    }


    static async updateOrder(orderDTO) {
        const respone = await axios.patch(`${baseURL}/orders/updateOrder`, orderDTO)
        return respone.data
    }


    static async deleteOrder(orderDTO) {
        const respone = await axios.delete(`${baseURL}/orders/deleteOrder`, {
            data: orderDTO
        })
        return respone.data
    }
}