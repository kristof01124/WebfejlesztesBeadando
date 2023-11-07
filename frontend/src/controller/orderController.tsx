import axios from "axios"
import { baseURL } from "./constants"

interface OrderDTO {
    orderId?: number,
    orderName?: string,
    price?: number,
    siteUserId: number
}

export class OrderController {
    static async getAll() {
        const respone = await axios.get(`${baseURL}/orders/getAll`)
        return respone.data
    }

    static async createOrder(orderDTO: OrderDTO) {
        const respone = await axios.post(`${baseURL}/orders/createOrder`, orderDTO)
        return respone.data
    }


    static async updateOrder(orderDTO: OrderDTO) {
        const respone = await axios.post(`${baseURL}/orders/updateOrder`, orderDTO)
        return respone.data
    }


    static async deleteOrder(id: number) {
        const respone = await axios.post(`${baseURL}/orders/deleteOrder`, id)
        return respone.data
    }
}