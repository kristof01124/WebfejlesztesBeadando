import axios from "axios"
import { baseURL } from "./constants"

interface SiteUserDTO {
    orderId?: number,
    orderName?: string,
    price?: number,
    siteUserId: number
}

export class OrderController {
    static async getAll() {
        const respone = await axios.get(`${baseURL}/siteUsers/getAll`)
        return respone.data
    }

    static async createSiteUser(siteUserDTO: SiteUserDTO) {
        const respone = await axios.post(`${baseURL}/siteUsers/createUser`, siteUserDTO)
        return respone.data
    }


    static async updateSiteUser(siteUserDTO: SiteUserDTO) {
        const respone = await axios.post(`${baseURL}/siteUsers/updateUser`, siteUserDTO)
        return respone.data
    }


    static async deleteSiteUser(id: number) {
        const respone = await axios.post(`${baseURL}/siteUsers/deleteUser`, id)
        return respone.data
    }
}